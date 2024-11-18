package com.example.latrinidadhighlights

object DataSource {

    val activities = listOf(
        Farms(
			name = "Strawberry Farm",
			description = "It is a popular tourist destination, especially during the strawberry season. The farm is known for its giant strawberry cake, which is made with fresh, locally-grown strawberries.",
			location = "Strawberry Valley Hotel, ID-58 Strawberry Farm, Swamp Area, La Trinidad",
			time = "6:00 AM to 6:00 PM",
			imageResId = R.drawable.strawberry_farm
        ),
        Farms(
			name = "Admirals Farm Park",
			description = "This is a developing recreational site for local residents of Benguet and Baguio. It has a playground, picnic tables, and a small petting zoo. ",
			location = "CHR3+VJ7, Pico - Lamtang Rd, La Trinidad",
			time = "8:00 AM to 5:00 PM",
			imageResId = R.drawable.admirals
        ),
        Farms(
			name = "Alapang Flower Farm",
			description = "This farm is located in the Alapang barangay, which is known for its potted flowers. The farm is home to a variety of flowers, including roses, sunflowers, and strawberries.",
			location = "FHFX+RWH, Obudan, La Trinidad",
			time = "8:00 AM to 5:00 PM",
			imageResId = R.drawable.alapang
        ),
		Farms(
			name = "Mount Costa",
			description = "This is a peaceful landscaped garden with themed sections, seasonal flowers, sculptures & picnic tables.",
			location = "ME 33 Lamtang, Pico-Lamtang Road, Puguis, La Trinidad",
			time = "7:00 AM to 5:00 PM",
			imageResId = R.drawable.costaaa
		),
		Farms(
			name = "Bahong Sunflower Farm",
			description = "Summer is the best time to visit Bahong Sunflower Farm, see its staple sunflowers when the weather is getting warmer and the sun shines a bit longer",
			location = "Bahong Rd, La Trinidad.",
			time = "Open from Tuesday to Sunday, 9 AM - 5 PM.",
			imageResId = R.drawable.bahong
		)
    )

    val eatsOptions = listOf(
        Eats(
			name = "Arca's Yard",
			specialty = "Arca's Yard is a popular cafe known for its cozy atmosphere, mini library, and delicious food and drinks. It's a great place to relax, read a book, and enjoy a cup of coffee or tea. Their specialty is their kamote pie, which is a sweet potato pie that is both sweet and savory.",
			location = "777 Tiptop, Ambuklao Rd, La Trinidad",
			time = "8:00 AM to 7:30 PM",
			imageResId = R.drawable.arca
        ),
        Eats(
			name = "Taste and Cups by Joanna C.",
			specialty = "This cafe offers a wide range of food and drinks, including pastries, cakes, sandwiches, and coffee. They also have a kids' play area, making it a great option for families.",
			location = "Pico - Lamtang Rd., La Trinidad",
			time = "10:00 AM to 8:30 PM",
			imageResId = R.drawable.tastte
        ),
        Eats(
			name = "Zambalii Grill",
			specialty = "Zambalii Grill is an excellent dining spot known for its cozy atmosphere and diverse menu, including local delicacies and international dishes like their flavorful Chicken Inasal and tasty sandwiches.",
			location = "Beckel, La Trinidad",
			time = "9:00 AM to 7:30 PM",
			imageResId = R.drawable.zambali
        )
    )

    val othersExperiences = listOf(
        Others(
			name = "Mt. Yangbew",
			description = "Mt. Yangbew, also known as Mt. Jumbo, is a popular hiking destination near La Trinidad, Benguet. It's particularly famous for its stunning views of the La Trinidad Valley and the surrounding mountains, especially during sunrise and sunset.",
			location = "Ambiong-Lubas-Tawang Rd., La Trinidad",
			imageResId = R.drawable.yangbew
        ),
        Others(
			name = "Bell Church",
			description = "The Bell Church, located in La Trinidad, Benguet, is a unique and fascinating Chinese temple that blends Taoist and Buddhist traditions. It's a popular tourist destination, known for its intricate architecture, serene atmosphere, and cultural significance.",
			location = "Bell Church Rd, La Trinidad",
			imageResId = R.drawable.betterchurch
        ),
        Others(
			name = "Adivay Festival",
			description = "The Adivay Festival is a vibrant celebration of the rich cultural heritage of Benguet Province in the Philippines. The name \"Adivay\" is an Ibaloi word meaning \"coming together and having fun.\"",
			location = " Benguet Sports Complex, La Trinidad",
			imageResId = R.drawable.adivay
        )
    )

    val culturalAttractions = listOf(
        Attraction(
			name = "Bahong Sunflower Farm",
			description = "Summer is the best time to visit Bahong Sunflower Farm, see its staple sunflowers when the weather is getting warmer and the sun shines a bit longer",
			location = "Bahong Rd, La Trinidad.",
			hours = "Open from Tuesday to Sunday, 9 AM - 5 PM.",
			imageResId = R.drawable.bahong
        ),
        Attraction(
			name = "Arca's Yard Library & Museum",
			description = "Tam-Awan Village is an artist's village that celebrates Cordilleran culture through art and community. Visitors can explore traditional huts made from indigenous materials, view local artworks, and participate in workshops that teach traditional crafts like weaving and pottery.",
			location = "777 Tiptop Road, La Trinidad",
			hours = "8:00 AM to 7:30 PM",
			imageResId = R.drawable.arcamuseum
        ),
        Attraction(
			name = "Strawberry Farm",
			description = "It is a popular tourist destination, especially during the strawberry season. The farm is known for its giant strawberry cake, which is made with fresh, locally-grown strawberries.",
			location = "Strawberry Valley Hotel, ID-58 Strawberry Farm, Swamp Area, La Trinidad",
			hours = "6:00 AM to 6:00 PM",
			imageResId = R.drawable.strawberry_farm
        ),
        Attraction(
			name = "Mt. Kalugong Cultural Village",
			description = "This high-altitude destination offers stunning panoramic views of the La Trinidad Valley, as well as a variety of cultural attractions such as traditional Igorot huts, a coffee shop, and hiking trails.",
			location = "Kalugong Rd, La Trinidad.",
			hours = "7:00 AM to 6:00 PM",
			imageResId = R.drawable.kalugong
        )
    )
}
