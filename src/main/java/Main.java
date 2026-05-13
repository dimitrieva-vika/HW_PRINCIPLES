public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;

        post.birthdate = new FormDate();
        post.birthdate.day = 13;
        post.birthdate.month = 6;
        post.birthdate.year = 1999;

        // ВЫВОД НА ЭКРАН (добавьте эти 3 строчки)
        System.out.println("Фамилия: " + post.surname);
        System.out.println("Имя: " + post.name);
        System.out.println("Отчество: " + post.patronymic);
        System.out.println("Паспорт: " + post.passport);
        System.out.println("Телефон: " + post.phone);
        System.out.println("Подписка на SMS: " + post.subscription);
        System.out.println("Дата рождения: " + post.birthdate.day + "." + post.birthdate.month + "." + post.birthdate.year);
    }
}