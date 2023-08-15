package com.test.data.api.models

object Mock {
    val data=TrainingSeries(
        description ="this \n is \n a \n multiline \n description \n",
        Instructor(
            name = "Josh Karmer",
            profilePicUrl = "https://pbs.twimg.com/media/FjU2lkcWYAgNG6d.jpg",
            videoUrl ="https://www.youtube.com/watch?v=2y4XiyJv0pQ&list=PLQkwcJG4YTCT1LkjokmzZUFFyFVVWPuKk&ab_channel=PhilippLackner" ,
            about = "this \n is \n a \n multiline \n about \n"
        ),
        totalRunTime = "03 hrs 08 mins(7 videos)",
        difficulty = "Intermidiate",
        intensity = "Level 4",
        classes = listOf(
            TrainingClass(
                title ="HOW TO APPROACH THIS SERIES",
                duration = "1:11",
                classDescription = "",
                comments = listOf(),
                isWatched = true
            ),
            TrainingClass(
                title ="Day 1: Upper Body Strength",
                duration = "30:47",
                classDescription = "Test your strength and ........",
                comments = listOf(),
                isWatched = true
            ),
            TrainingClass(
                title ="Day 2: CORE ISOLATION",
                duration = "25:55",
                classDescription = "shock your cor into overdrive.",
                comments = listOf(),
                isWatched = true
            )
        )
    )
}