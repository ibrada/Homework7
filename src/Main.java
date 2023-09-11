public class Main {
    public static void main(String[] args) {

/* Task 1 */ System.out.println("*** Task 1 ***");

        int deposite = 0;
        int input = 15000;
        int m = 1;
        while (deposite <= 2_459_000) {
            deposite = deposite + deposite / 100;
            deposite = deposite + input;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + deposite + " рублей");
            m = m + 1;
        }

/* Task 2 */ System.out.println("*** Task 2 ***");

        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();

/* Task 3 */ System.out.println("*** Task 3 ***");

        int popul = 12000000;
        int born = 17;
        int death = 8;
        for (int y = 2023; y < 2023 + 10; y++) {
            popul = popul + popul * (born - death) / 1000;
            System.out.println("Год " + y + " численность населения составляет " + popul);
        }

/* Task 4 */ System.out.println("*** Task 4 ***");

        int dep = 15000;
        int mon = 1;
        while (dep <= 12000000) {
            dep = dep + dep / 100 * 7;
            System.out.println("Месяц " + mon + ", сумма накоплений равна " + dep + " рублей");
            mon = mon + 1;
        }

/* Task 5 */ System.out.println("*** Task 5 ***");

        int dep1 = 15000;
        int mon1 = 1;
        while (dep1 <= 12000000) {
            dep1 = dep1 + dep1 / 100 * 7;
            if (mon1 % 6 == 0)
                System.out.println("Месяц " + mon1 + ", сумма накоплений равна " + dep1 + " рублей");
            mon1 = mon1 + 1;
        }

/* Task 6 */ System.out.println("*** Task 6 ***");

        int dep2 = 15000;
        int mon2 = 1;
        while (mon2 <= 9 * 12) {
            dep2 = dep2 + dep2 / 100 * 7;
            if (mon2 % 6 == 0)
                System.out.println("Месяц " + mon2 + ", сумма накоплений равна " + dep2 + " рублей");
            mon2 = mon2 + 1;
        }

/* Task 7 */ System.out.println("*** Task 7 ***");

        int fD = 1;
        for (int day = 0; day <=31; day++) {
            if (day % 7 == fD) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }

/* Task 8 */ System.out.println("*** Task 8 ***");

        int cometa = 79;
        int past = 2023 - 200;
        int future = 2023 + 100;
        for (int y = past; y <= future; y++) {
            if (y % cometa == 0) {
                System.out.println(y);
            }
        }
    }
}