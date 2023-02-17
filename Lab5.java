import java.util.Scanner;
    class Fraction{
        public int chislitel, znamenatel;
        public int nod = 1;
        public int i;
        public int k1, k2,n;

        //Дробь
        public Fraction(){
            chislitel = 1;
            znamenatel = 1;
        }
        //Дробь
        public Fraction(int a, int b) throws Exception {
            if (b != 0) {
                chislitel = a;
                znamenatel = b;
            } else {
                throw new Exception("Деление на ноль");


            }
        }

        //ВЫВОД
        public void vivod(){
            System.out.println(chislitel + "/" + znamenatel);
        }
        //ПЛЮС
        public void sum(int a, int b, int c, int d) {
            k1 = (a * d + b * c);
            k2 = (b * d);
            n = k1/k2;
            for (i = 1; i <= k1 && i <= k2; i++) {
                if (k1 % i == 0 && k2 % i == 0) {
                    nod = i;
                }
            }
            k1 = k1/nod;
            k2 = k2/nod;
            if (k1>=k2){
                if ((k1-n*k2)==0){
                    System.out.println("Результат: "+n);

                }
                else
                    System.out.println("Результат: " + n + " " + ((k1-n*k2)+"/"+k2));
            }
            else
                System.out.println("Результат: " + k1 + "/" + k2);
        }
        //МИНУС
        public void min(int a, int b, int c, int d){
            k1 = (a * d - b * c);
            k2 = (b * d) ;
            n = k1/k2;
            for (i = 1; i <= k1 && i <= k2; i++) {
                if (k1 % i == 0 && k2 % i == 0) {
                    nod = i;
                }
            }
            k1 = k1/nod;
            k2 = k2/nod;
            if (k1>k2){
                if ((k1-n*k2)==0){
                    System.out.println("Результат: "+n);
                }
                else
                    System.out.println("Результат: " + n + " " + ((k1-n*k2)+"/"+k2));
            }
            else
                System.out.println("Результат: " + k1 + "/" + k2);
        }
        //Умножение
        public void umnogenie(int a, int b, int c, int d) {
            k1 = (a * c);
            k2 = (b * d);
            n = k1/k2;
            for (i = 1; i <= k1 && i <= k2; i++) {
                if (k1 % i == 0 && k2 % i == 0) {
                    nod = i;
                }
            }
            k1 = k1/nod;
            k2 = k2/nod;
            if (k1>k2){
                if ((k1-n*k2)==0){
                    System.out.println("Результат: "+n);
                }
                else
                    System.out.println("Результат: " + n + " " + ((k1-n*k2)+"/"+k2));
            }
            else
                System.out.println("Результат: " + k1 + "/" + k2);
        }
        //Деление
        public void delenie(int a, int b, int c, int d) {
            k1 = (a * d) ;
            k2 = (c * b);
            n = k1/k2;
            for (i = 1; i <= k1 && i <= k2; i++) {
                if (k1 % i == 0 && k2 % i == 0) {
                    nod = i;
                }
            }
            k1 = k1/nod;
            k2 = k2/nod;
            if (k1>k2){
                if ((k1-n*k2)==0){
                    System.out.println("Результат: "+n);
                }
                else
                    System.out.println("Результат: " + n + " " + ((k1-n*k2)+"/"+k2));
            }
            else
                System.out.println("Результат: " + k1 + "/" + k2);

        }


    }

    public class Lab5{
        public static void main(String[] args) throws Exception {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите действие, которое хотите произвести над дробью (создание простой дроби, создание простой дроби по умолчанию, сложение, вычитание, умножение, деление): ");
            String a;
            String a1 = "создание простой дроби по умолчанию";
            String a2 = "создание простой дроби";
            String a3 = "сложение";
            String a4 = "вычитание";
            String a5 = "умножение";
            String a6 = "деление";
            a = in.nextLine();

            if (a.equals(a1)) {
                Fraction drob = new Fraction();
                drob.vivod();
            }
            if ( a.equals(a2)) {
                System.out.println("Введите значения числителя и знаменателя:");
                Fraction drob = new Fraction(in.nextInt(), in.nextInt());
                drob.vivod();
            }


            //ПЛЮС
            if  (a.equals(a3)) {
                System.out.println("СЛОЖЕНИЕ");
                System.out.println("Введите значения числителя и знаменателя первой дроби:");
                Fraction drob = new Fraction(in.nextInt(), in.nextInt());
                System.out.println("Введите значения числителя и знаменателя второй дроби:");
                Fraction drob1 = new Fraction(in.nextInt(), in.nextInt());
                drob.sum(drob.chislitel, drob.znamenatel, drob1.chislitel, drob1.znamenatel);

            }

            //МИНУС
            if  (a.equals(a4)) {
                System.out.println("ВЫЧИТАНИЕ");
                System.out.println("Введите значения числителя и знаменателя первой дроби:");
                Fraction drob = new Fraction(in.nextInt(), in.nextInt());
                System.out.println("Введите значения числителя и знаменателя второй дроби:");
                Fraction drob1 = new Fraction(in.nextInt(), in.nextInt());
                drob.min(drob.chislitel, drob.znamenatel, drob1.chislitel, drob1.znamenatel);
            }



            //УМНОЖЕНИЕ
            if  (a.equals("умножение")) {
                System.out.println("УМНОЖЕНИЕ");
                System.out.println("Введите значения числителя и знаменателя первой дроби:");
                Fraction drob = new Fraction(in.nextInt(), in.nextInt());
                System.out.println("Введите значения числителя и знаменателя второй дроби:");
                Fraction drob1 = new Fraction(in.nextInt(), in.nextInt());
                drob.umnogenie(drob.chislitel, drob.znamenatel, drob1.chislitel, drob1.znamenatel);
            }

            //ДЕЛЕНИЕ
            if  (a.equals(a6)) {
                System.out.println("ДЕЛЕНИЕ");
                System.out.println("Введите значения числителя и знаменателя первой дроби:");
                Fraction drob = new Fraction(in.nextInt(), in.nextInt());
                System.out.println("Введите значения числителя и знаменателя второй дроби:");
                Fraction drob1 = new Fraction(in.nextInt(), in.nextInt());
                drob.delenie(drob.chislitel, drob.znamenatel, drob1.chislitel, drob1.znamenatel);
            }
            in.close();
        }
    }
