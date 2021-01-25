package com.canytech.fitnessapp

class Constants {

    companion object {
        fun defaultExerciseList(): ArrayList<ExerciseModel> {
            val exerciseList = ArrayList<ExerciseModel>()

            val benchPress1 = ExerciseModel(1, "BenchPress", R.drawable.bushpress, false, false)
            val benchPress2 = ExerciseModel(2, "BenchPress", R.drawable.bushpress, false, false)
            val benchPress3 = ExerciseModel(3, "BenchPress", R.drawable.bushpress, false, false)
            val benchPress4 = ExerciseModel(4, "BenchPress", R.drawable.bushpress, false, false)

            val pushUps1 = ExerciseModel(5, "Push Up", R.drawable.pushups, false, false)
            val pushUps2 = ExerciseModel(6, "Push Up", R.drawable.pushups, false, false)
            val pushUps3 = ExerciseModel(7, "Push Up", R.drawable.pushups, false, false)

            val calf1 = ExerciseModel(8, "Calf", R.drawable.panturrilha, false, false)
            val calf2 = ExerciseModel(9, "Calf", R.drawable.panturrilha, false, false)
            val calf3 = ExerciseModel(10, "Calf", R.drawable.panturrilha, false, false)

            val squat1 = ExerciseModel(11, "Squat", R.drawable.squad, false, false)
            val squat2 = ExerciseModel(12, "Squat", R.drawable.squad, false, false)
            val squat3 = ExerciseModel(13, "Squat", R.drawable.squad, false, false)

            val thighs1 = ExerciseModel(14, "Thighs", R.drawable.thigs, false, false)
            val thighs2 = ExerciseModel(15, "Thighs", R.drawable.thigs, false, false)
            val thighs3 = ExerciseModel(16, "Thighs", R.drawable.thigs, false, false)
            val thighs4 = ExerciseModel(17, "Thighs", R.drawable.thigs, false, false)

            val pushUps4 = ExerciseModel(18, "Push Up", R.drawable.pushups, false, false)
            val pushUps5 = ExerciseModel(19, "Push Up", R.drawable.pushups, false, false)
            val pushUps6 = ExerciseModel(20, "Push Up", R.drawable.pushups, false, false)

            val abdominal1 = ExerciseModel(21, "Abdominal", R.drawable.abdominal, false, false)
            val abdominal2 = ExerciseModel(22, "Abdominal", R.drawable.abdominal, false, false)
            val abdominal3 = ExerciseModel(23, "Abdominal", R.drawable.abdominal, false, false)
            val abdominal4 = ExerciseModel(24, "Abdominal", R.drawable.abdominal, false, false)

            val halteres1 = ExerciseModel(25, "halteres", R.drawable.haltars, false, false)
            val halteres2 = ExerciseModel(26, "halteres", R.drawable.haltars, false, false)
            val halteres3 = ExerciseModel(27, "halteres", R.drawable.haltars, false, false)
            val halteres4 = ExerciseModel(28, "halteres", R.drawable.haltars, false, false)

            exerciseList.add(benchPress1)
            exerciseList.add(benchPress2)
            exerciseList.add(benchPress3)
            exerciseList.add(benchPress4)

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
            exerciseList.add(thighs4)

            exerciseList.add(pushUps4)
            exerciseList.add(pushUps5)
            exerciseList.add(pushUps6)

            exerciseList.add(abdominal1)
            exerciseList.add(abdominal2)
            exerciseList.add(abdominal3)
            exerciseList.add(abdominal4)

            exerciseList.add(halteres1)
            exerciseList.add(halteres2)
            exerciseList.add(halteres3)
            exerciseList.add(halteres4)

            return exerciseList
        }
    }
}
