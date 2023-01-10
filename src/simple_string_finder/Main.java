package simple_string_finder;

public class Main {
    public static void main(String[] args) {
        String text = "Кожен рядок, який створюється оператором new або літералом (вкладений у подвійні апострофи), є " +
                "об'єктом класу String. Особливістю об'єкта класу String є те, що його значення не може бути змінено після створення об'єкта за " +
                "допомогою будь-якого методу класу, оскільки будь-яка зміна рядка призводить до створення нового об'єкта. " +
                "Класи StringBuilder і StringBuffer є «близнюками» та за своїм призначенням близькі до класу String, але, " +
                "на відміну від останнього, вміст і розміри об'єктів класів StringBuilder і StringBuffer можна змінювати. " +
                "Основною та єдиною відмінністю StringBuilder від StringBuffer є потокобезпека останнього.";

        final int mid = text.length()/2;

        String text1 = text.substring(0, mid);
        String text2 = text.substring(mid);
        String[] array1 = text1.split("[.]");
        String[] array2 = text2.split("[.]");

        for (String temp1 : array1) {
            System.out.println(temp1);
        }
        System.out.println();
        for (String temp2 : array2) {
            System.out.println(temp2);
        }
    }
}
