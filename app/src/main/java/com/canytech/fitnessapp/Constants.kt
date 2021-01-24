package com.canytech.fitnessapp

class Constants {

    companion object {
        fun defaultExerciseList(): ArrayList<ExerciseModel> {
            val exerciseList = ArrayList<ExerciseModel>()

            val benchPress1 = ExerciseModel(1, "BenchPress", R.drawable.i, false, false)
            val benchPress2 = ExerciseModel(2, "BenchPress", R.drawable.i, false, false)
            val benchPress3 = ExerciseModel(3, "BenchPress", R.drawable.i, false, false)

            val pushUps1 = ExerciseModel(4, "Push Up", R.drawable.p, false, false)
            val pushUps2 = ExerciseModel(5, "Push Up", R.drawable.p, false, false)
            val pushUps3 = ExerciseModel(6, "Push Up", R.drawable.p, false, false)

            val calf1 = ExerciseModel(7, "Calf", R.drawable.n, false, false)
            val calf2 = ExerciseModel(8, "Calf", R.drawable.n, false, false)
            val calf3 = ExerciseModel(9, "Calf", R.drawable.n, false, false)

            val squat1 = ExerciseModel(10, "Squat", R.drawable.j, false, false)
            val squat2 = ExerciseModel(11, "Squat", R.drawable.j, false, false)
            val squat3 = ExerciseModel(12, "Squat", R.drawable.j, false, false)

            val thighs1 = ExerciseModel(13, "Thighs", R.drawable.h, false, false)
            val thighs2 = ExerciseModel(14, "Thighs", R.drawable.h, false, false)
            val thighs3 = ExerciseModel(15, "Thighs", R.drawable.h, false, false)

            val pushUps4 = ExerciseModel(16, "Push Up", R.drawable.p, false, false)
            val pushUps5 = ExerciseModel(17, "Push Up", R.drawable.p, false, false)
            val pushUps6 = ExerciseModel(18, "Push Up", R.drawable.p, false, false)

            val abdominal1 = ExerciseModel(19, "Abdominal", R.drawable.abdmon, false, false)
            val abdominal2 = ExerciseModel(20, "Abdominal", R.drawable.abdmon, false, false)
            val abdominal3 = ExerciseModel(21, "Abdominal", R.drawable.abdmon, false, false)

            val halteres1 = ExerciseModel(22, "halteres", R.drawable.abdmon, false, false)
            val halteres2 = ExerciseModel(23, "halteres", R.drawable.abdmon, false, false)
            val halteres3 = ExerciseModel(24, "halteres", R.drawable.abdmon, false, false)

            exerciseList.add(benchPress1)
            exerciseList.add(benchPress2)
            exerciseList.add(benchPress3)

            exerciseList.add(pushUps1)
            exerciseList.add(pushUps2)
            exerciseList.add(pushUps3)

            exerciseList.add(calf1)
            exerciseList.add(calf2)
            exerciseList.add(calf3)

            exerciseList.add(squat1)
            exerciseList.add(squat2)
            exerciseList.add(squat3)

            exerciseList.add(thighs1)
            exerciseList.add(thighs2)
            exerciseList.add(thighs3)

            exerciseList.add(pushUps4)
            exerciseList.add(pushUps5)
            exerciseList.add(pushUps6)

            exerciseList.add(abdominal1)
            exerciseList.add(abdominal2)
            exerciseList.add(abdominal3)

            exerciseList.add(halteres1)
            exerciseList.add(halteres2)
            exerciseList.add(halteres3)

            return exerciseList
        }
    }
}
