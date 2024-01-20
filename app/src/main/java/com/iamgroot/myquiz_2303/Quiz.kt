package com.iamgroot.myquiz_2303

data class Quiz(
    val question: String,
    val options: List<String>,
    val correctAnswerIndex:Int
)