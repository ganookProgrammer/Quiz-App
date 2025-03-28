package com.example.quizapp.ui_layer.utils

object Constants {

    val numbersAsString = listOf("10") + (1 .. 50).map { it.toString() }

    val categories = listOf(
        "General Knowledge",
        "Entertainment Books",
        "Entertainment Film",
        "Entertainment Music",
        "Entertainment Musicals & Theatres",
        "Entertainment Television",
        "Entertainment Video Games",
        "Entertainment Board Games",
        "Science & Nature",
        "Science Computer",
        "Science Mathematics",
        "Mythology",
        "Sports",
        "Geography",
        "History",
        "Politics",
        "Art",
        "Celebrities",
        "Animals",
        "Vehicles",
        "Entertainment: Comics",
        "Science: Gadgets",
        "Entertainment: Japanese Anime & Menga",
        "Entertainment: Cartoon & Animations"
    )

    val categoriesMap = listOf(
        "General Knowledge" to 9,
        "Entertainment Books" to 10,
        "Entertainment Film" to 11,
        "Entertainment Music" to 12,
        "Entertainment Musicals & Theatres" to 13,
        "Entertainment Television" to 14,
        "Entertainment Video Games" to 15,
        "Entertainment Board Games" to 16,
        "Science & Nature" to 17,
        "Science Computer" to 18,
        "Science Mathematics"  to 19,
        "Mythology" to 20,
        "Sports" to 21,
        "Geography" to 22,
        "History" to 23,
        "Politics" to 24,
        "Art" to 25,
        "Celebrities" to 26,
        "Animals" to 27,
        "Vehicles" to 28,
        "Entertainment: Comics" to 29,
        "Science: Gadgets" to 30,
        "Entertainment: Japanese Anime & Menga" to 31,
        "Entertainment: Cartoon & Animations" to 32
    )

    val diffcultiy = listOf("Easy" , "Medium" , "Hard")

    val type  = listOf("Multiple Choice" , "True/False")
}