package com.iamgroot.myquiz_2303

import androidx.lifecycle.ViewModel

class PlayViewModel : ViewModel() {
   private val quizList = LocalDataSource.questions

    private var currentIndex = 0
    private var score = 0

    fun getCurrentQuestion(): Quiz {
        return quizList[currentIndex]
    }

    fun nextQuestion(): Quiz? {
        currentIndex++

        return if (currentIndex < quizList.size) {
               quizList[currentIndex]
 } else {
    null
  }



    }

fun checkAnswer(selectedIndex: Int) {
    val currentQuiz = quizList[currentIndex]

    if (selectedIndex == currentQuiz.correctAnswerIndex) {
   score++
   } else {
        score--
     }
}

fun getScore(): Int {
     return score

}



}




