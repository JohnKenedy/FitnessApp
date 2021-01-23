package com.canytech.fitnessapp

class Constants {

    companion object {
        fun defaultExerciseList(): ArrayList<ExerciseModel> {
            val exerciseList = ArrayList<ExerciseModel>()

            val benchPress = ExerciseModel(1, "BenchPress", R.drawable.i, false, false)
            val flexion = ExerciseModel(2, "Flexion", R.drawable.p, false, false)
            val calf = ExerciseModel(3, "Calf", R.drawable.n, false, false)
            val squat = ExerciseModel(4, "Squat", R.drawable.j, false, false)
            val thighs = ExerciseModel(5, "Thighs", R.drawable.h, false, false)
            val flexion2 = ExerciseModel(6, "Flexion", R.drawable.p, false, false)
            val abdominal = ExerciseModel(7, "Abdominal", R.drawable.abdmon, false, false)

            exerciseList.add(benchPress)
            exerciseList.add(flexion)
            exerciseList.add(calf)
            exerciseList.add(squat)
            exerciseList.add(thighs)
            exerciseList.add(flexion2)
            exerciseList.add(abdominal)

            return exerciseList
        }
    }
}
