package lenkevich.edostavka.utils;

import com.github.javafaker.Faker;

public class Util {
    static Faker faker = new Faker();

    public static String generatePhone() {
        String phone = faker.phoneNumber().cellPhone();
        return phone;
    }

    public static String generatePassword() {
        String password = faker.internet().password();
        return password;
    }

    public static String generateLastName() {
        String surname = faker.name().lastName();
        return surname;
    }
}
