package com.example.latrinidadguide

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.res.Configuration

class EatsOptionsFragment : Fragment() {

    private lateinit var eatsAdapter: EatsAdapter
    private val viewModel: EatsOptionsViewModel by viewModels()
    private var isTwoPane: Boolean = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE &&
                      resources.configuration.screenWidthDp >= 600) {
            inflater.inflate(R.layout.fragment_category_list_twopane, container, false)
        } else {
            inflater.inflate(R.layout.fragment_category_list, container, false)
        }

        val recyclerView: RecyclerView = view.findViewById(R.id.itemRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)

        isTwoPane = view.findViewById<View?>(R.id.detail_container) != null

        eatsAdapter = EatsAdapter(emptyList()) { dining ->
            if (isTwoPane) {
                showDetailFragment(dining)
            } else {
                val action = EatsOptionsFragmentDirections.actionDiningOptionsToDetail(dining)
                findNavController().navigate(action)
            }
        }

        recyclerView.adapter = eatsAdapter

        viewModel.eatsOptions.observe(viewLifecycleOwner) { diningOptions ->
            eatsAdapter.updateDiningOptions(diningOptions)
            if (isTwoPane && diningOptions.isNotEmpty()) {
                showDetailFragment(diningOptions[0])
            }
        }

        return view
    }

    private fun showDetailFragment(eats: Eats) {
        view?.findViewById<View>(R.id.detail_container)?.let {
            val detailFragment = DetailFragment.newInstance(eats)
            childFragmentManager.beginTransaction()
                .replace(R.id.detail_container, detailFragment)
                .commit()
        }
    }
}
