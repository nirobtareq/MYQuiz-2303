package com.iamgroot.myquiz_2303

object LocalDataSource {

val questions= mutableListOf<Quiz>(
    Quiz("বাংলাদেশে সব থেকে বেশি কোন ফসল উৎপাদন হয়?",
     listOf("আম","জাম","ধান","পাট" ),
        correctAnswerIndex = 0
    ),  Quiz("পাটকে বাংলাদেশের কি ফসল বলা হয়?",
        listOf("প্রকৃতির ফসল","জাতীয় ফসল","বাঙালি ফসল","আদি ফসল" ),
        correctAnswerIndex = 1
    ),  Quiz(
        "What is the capital of Bangladesh?",
        listOf("Dhaka", "Chittagong", "Khulna", "Sylhet"),
        correctAnswerIndex = 0
    ),
    Quiz(
        "Which is the largest river in Bangladesh?",
        listOf("Jamuna River", "Padma River", "Meghna River", "Surma River"),
        correctAnswerIndex = 1
    ),
    Quiz(
        "What is the national language of Bangladesh?",
        listOf("Bangla", "English", "Hindi", "Urdu"),
        correctAnswerIndex = 0
    ),
    Quiz(
        "Which is the largest district in Bangladesh?",
        listOf("Rangpur District", "Mymensingh District", "Sylhet District", "Rajshahi District"),
        correctAnswerIndex = 0
    ),
    Quiz(
        "What is the national flower of Bangladesh?",
        listOf("Water Lily", "Rose", "Marigold", "Jasmine"),
        correctAnswerIndex = 0
    ),
    Quiz(
        "Which is the largest mangrove forest in Bangladesh?",
        listOf("Sundarbans Forest", "Kaptai Forest", "Chittagong Hill Tracts Forest", "Madhupur Forest"),
        correctAnswerIndex = 0
    ),
    Quiz(
        "What is the national animal of Bangladesh?",
        listOf("Bengal Tiger", "Asian Elephant", "Gaur", "Irrawaddy Dolphin"),
        correctAnswerIndex = 0
    ),
    Quiz(
        "Which is the largest tea garden in Bangladesh?",
        listOf("Ispahani Tea Garden", "Machete Tea Garden", "Limana Tea Garden", "Borakona Tea Garden"),
        correctAnswerIndex = 0
    ),
    Quiz(
        "What is the national bird of Bangladesh?",        listOf("Magpie Robin", "Mynah", "Sparrow", "Parakeet"),
        correctAnswerIndex = 0
    ),
    Quiz(
        "Which is the largest port in Bangladesh?",
        listOf("Chittagong Port", "Mongla Port", "Payra Port", "Akhaura Land Port"),
        correctAnswerIndex = 0
    )


)


}