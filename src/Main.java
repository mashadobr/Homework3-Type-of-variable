public class Main {
    public static void main(String[] args) {

        //задача 1
        System.out.println("Задача 1");
        int a = 33000;
        byte b = 100;
        short c = 500;
        long d = 3000000L;
        float e = 3.14f;
        double f = 6.1111;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной a с типом byte равно " + b);
        System.out.println("Значение переменной a с типом short равно " + c);
        System.out.println("Значение переменной a с типом long равно " + d);
        System.out.println("Значение переменной a с типом float равно " + e);
        System.out.println("Значение переменной a с типом doublr равно " + f);
        System.out.println("__________________________________________________ ");

        //задача 2
        System.out.println("Задача 2");
        float g = 22.12f;
        long i = 987678965549L;
        float k = 2.786f;
        short l = 569;
        short m = -159;
        short o = 27897;
        byte p = 67;
        System.out.println("__________________________________________________ ");

        //задача 3
        System.out.println("Задача 3");
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short paperLists = 480;
        int totalStudents = studentsLP + studentsAS + studentsEA;
        int listsFor1student = paperLists / totalStudents;
        System.out.println("На каждого ученика рассчитано " + listsFor1student + " листов бумаги");
        System.out.println("__________________________________________________ ");

        //задача 4
        System.out.println("Задача 4");
        byte bottleFor1min = 16 / 2;
        int bottleFor20Min = bottleFor1min * 20;
        int bottleFor1Day = bottleFor1min * 60 * 24;
        int bottleFor3Days = bottleFor1Day * 3;
        int bottlefor1Mounth = bottleFor1Day * 30;
        System.out.println("За 20 минут машина произвела " + bottleFor20Min + " штук бутылок");
        System.out.println("За 1 сутки машина произвела " + bottleFor1Day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleFor3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlefor1Mounth + " штук бутылок");
        System.out.println("__________________________________________________ ");
        //задача 5
        System.out.println("Задача 5");
        byte totalCan = 120;
        byte whiteCanFor1Class = 2;
        byte brownCanFor1Class = 4;
        int totalClassroom = 120 / (whiteCanFor1Class + brownCanFor1Class);
        int totalWhite = whiteCanFor1Class * totalClassroom;
        int totalBrown = brownCanFor1Class * totalClassroom;
        System.out.println("В школе, где " + totalClassroom + " классов, нужно " + totalWhite +
                " банок белой краски и " + totalBrown + " банок коричневой краски");
        System.out.println("__________________________________________________ ");

        //задача 6
        System.out.println("Задача 6");
        byte weightBanana = 80;
        byte totalBananas = 5;
        byte weightMilk100Ml = 105;
        byte totalMilk = 2;
        byte weightIcecream = 100;
        byte totalIcecream = 2;
        byte weightEgg = 70;
        byte totalEggs = 5;
        int totalWeightGr = weightBanana * totalBananas + weightMilk100Ml * totalMilk + weightIcecream *
                totalIcecream + weightEgg * totalEggs;
        float totalWeightKg = (float) totalWeightGr / 1000;
        System.out.println("Вес завтрака спортсмена в граммах " + totalWeightGr +
                " грамм, в килограммах " + totalWeightKg + " кг");
        System.out.println("__________________________________________________ ");

        //задача 7
        System.out.println("Задача 7");
        int overweightGr = 7000;
        short wasteWeight = 250;
        int dayForWasteWeight1 = overweightGr / wasteWeight;
        System.out.println("Потребуеется " + dayForWasteWeight1 +
                " дней для похудения, если спортсмен будет терять каждый день по " + wasteWeight + " грамм");
        wasteWeight = 500;
        int dayForWasteWeight2 = overweightGr / wasteWeight;
        System.out.println("Потребуеется " + dayForWasteWeight2 +
                " дней для похудения, если спортсмен будет терять каждый день по " + wasteWeight + " грамм");
        int averageNumberDay = (dayForWasteWeight1 + dayForWasteWeight2) / 2;
        System.out.println("В среднем потребуется " + averageNumberDay + " дней для похудения");
        System.out.println("__________________________________________________ ");

        //задача 8
        System.out.println("Задача 8");
        float mounthSalaryMasha = 67760;
        float mounthSalaryDenis = 83690;
        float mounthSalaryKris = 76230;
        float riseSalary = 1.1f;
        int totalMouth = 12;
        float yearSalaryMasha1 = (float) mounthSalaryMasha * totalMouth;
        float yearSalaryDenis1 = (float) mounthSalaryDenis * totalMouth;
        float yearSalaryKris1 = (float) mounthSalaryKris * totalMouth;

        mounthSalaryMasha = mounthSalaryMasha * riseSalary;
        mounthSalaryDenis = mounthSalaryDenis * riseSalary;
        mounthSalaryKris = mounthSalaryKris * riseSalary;
        float yearSalaryMasha2 = mounthSalaryMasha * totalMouth;
        float yearSalaryDenis2 = mounthSalaryDenis * totalMouth;
        float yearSalaryKris2 = mounthSalaryKris * totalMouth;
        System.out.println("Маша теперь получает " + mounthSalaryMasha + " рублей. Годовой доход вырос на " +
                (yearSalaryMasha2 - yearSalaryMasha1) + " рублей");
        System.out.println("Денис теперь получает " + mounthSalaryDenis + " рублей. Годовой доход вырос на " +
                (yearSalaryDenis2 - yearSalaryDenis1) + " рублей");
        System.out.println("Кристина теперь получает " + mounthSalaryKris + " рублей. Годовой доход вырос на " +

                (yearSalaryKris2 - yearSalaryKris1) + " рублей");
        System.out.println("__________________________________________________ ");


    }

}