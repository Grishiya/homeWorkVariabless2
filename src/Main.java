public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        int a = 123456;
        byte b = 1;
        short c = 150;
        long d = 145423566445L;
        float e = 3.23f;
        double f = 3.435234562345d;
        System.out.println("Значение переменной (а), с типом int равно " + a);
        System.out.println("Значение переменной (b), с типом byte равно " + b);
        System.out.println("Значение переменной (c), с типом short равно " + c);
        System.out.println("Значение переменной (d), с типом long равно " + d);
        System.out.println("Значение переменной (e), с типом float равно " + e);
        System.out.println("Значение переменной (а), с типом int равно " + f);

    }

    public static void task2() {//В каждом методе могу называть переменные как в прошлых.
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786d;
        int d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        //В условие не сказано про вывод,но желтая лампа мне не нравится.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }

    public static void task3() {
        int lPTeachers = 23;
        int aSTeachers = 27;
        int eATeachers = 30;
        int leaf = 480;
        int totalTeachers = lPTeachers + aSTeachers + eATeachers;
        int leafOnTeacher = leaf / totalTeachers;
        System.out.println("На каждого ученика рассчитано " + leafOnTeacher + " листов бумаги.");
    }
    public static void task4(){
        int bottles2Min=16;
        int bottlesMin=bottles2Min/2;
        int bottles20min=bottlesMin*20;
        int minInDay=24*60;
        int bottlesInDay=bottlesMin*minInDay;
        int bottlesThreeDay=bottlesMin*minInDay*3;
        int minInMonth=minInDay*30;
        int bottlesInMonth=bottlesMin*minInMonth;
        String min20="За 20 минут ";
        String inDay="За сутки ";
        String threeDay= "За 3 дня ";
       String oneMonth="За 1 месяц ";
        System.out.println(min20+"машина произвела "+bottles20min+" штук бутылок");
        System.out.println(inDay+"машина произвела "+bottlesInDay+" штук бутылок");
        System.out.println(threeDay+"машина произвела "+bottlesThreeDay+" штук бутылок");
        System.out.println(oneMonth+"машина произвела "+bottlesInMonth+" штук бутылок");
    }
    public static void task5(){
int potsPaint=120;
int whitePaint=2;
int brownPaint=4;
int totalClass=potsPaint/(whitePaint+brownPaint);
int totalWhitePaint=totalClass*whitePaint;
int totalBrownPaint=totalClass*brownPaint;
        System.out.println("В школе где "+totalClass+" классов,нужно "+totalWhitePaint+
        " банок белой краски и "+totalBrownPaint+" банок коричневой краски.");
    }
    public static void task6(){
        int bananas=5;
        int weightOneBanana=80;
        int weightBananas=bananas*weightOneBanana;
        int weightMilk=105*2;
        int iceCreamWeight=100*2;
        int eggWeight=70*4;
        int servingInGrams=weightBananas+weightMilk+iceCreamWeight+eggWeight;
        System.out.println("Одна порция в граммах равна "+servingInGrams+" грамм.");
        double portionInKilograms=servingInGrams/1000d;
        System.out.println("Одна порция в килограммах равна "+portionInKilograms+" кг.");
    }
    public static void task7(){
     int excessWeight=7;
     int excessWeightGrams=excessWeight*1000;
     int calories1=250;//пусть будет каллории ,хоть и граммы)
     int calories2=500;
     int thinDays1=excessWeightGrams/calories1;
     int thinDays2=excessWeightGrams/calories2;
        System.out.println(thinDays1+" дней, если худеть по 250гр.");
        System.out.println(thinDays2+" дней, еслихудеть по 500гр.");
        int medDay=excessWeightGrams/((calories2+calories1)/2);//не уверен в правильности вычесления
        System.out.println(medDay+ " дней,если худет в среднем.");
    }
    public static void task8(){
        int zpMasha=67760;
        int zpDenis=83690;
        int zpKristina=76230;
        int perMasha=zpMasha/10,perDenis=zpDenis/10,perKristnina=zpKristina/10;
        int zpMashaUp=zpMasha+perMasha;
        int zpDenisUp=perDenis+zpDenis;
        int zpKristinaUp=perKristnina+zpKristina;
        int difMasha=zpMashaUp-zpMasha;
        int difDenis=zpDenisUp-zpDenis;
        int difKristina=zpKristinaUp-zpKristina;
        System.out.println("Маша теперь получает "+zpMashaUp+" рублей. Годовой доход вырос на "+difMasha+" рублей.");
        System.out.println("Денис теперь получает "+zpDenisUp+" рублей. Годовой доход вырос на "+difDenis+" рублей");
        System.out.println("Кристина теперь получает "+zpKristinaUp+" рублей. Годовой доход вырос на "+difKristina+" рублей");

        System.out.println(zpMasha);

    }
}