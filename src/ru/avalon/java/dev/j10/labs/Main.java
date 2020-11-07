package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;


public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    public static void main(String[] args) {

        Person ivanov = null;
        Person smith = null;

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */
        ivanov = new Person("Иван", "Иванов", "Иванович", "");
        smith = new Person("John", "Smith", "", "Edvard");
//        Person johndoe = new Person("Джон", "Доу");
//        Person test = new Person();
//        System.out.println("Test  " + test.getAddress() + "\n" + test.getFullName());
//        Person sidorov = new Person("Сидр","Сидоров","Сидорович","Яблочный");
//        System.out.println(ivanov.getFullName());
//        System.out.println(smith.getFullName());
//        System.out.println(johndoe.getFullName());
//        System.out.println(sidorov.getFullName());
        ivanov.passport.setBirthday("01.01.1970");
        ivanov.passport.setSer((short)1234);
        ivanov.passport.setNumb(567890);
        ivanov.passport.setRelease_date("01.01.2005");
        ivanov.passport.setOrganization("123 отдел милиции какого-то города");
        
        ivanov.passport.printPassport();  
        
        ivanov.address.setCountry("Russia");        
        ivanov.address.setCity("S-Pb");
        ivanov.address.setStreet("Nevsky pr.");
        ivanov.address.setHouse("45");
        ivanov.address.setApartment("123");        
        ivanov.address.setIndex(654321);


        System.out.println("===========================");
        
        smith.passport.setBirthday("01.01.1950");
        smith.passport.setSer((short)4321);
        smith.passport.setNumb(123456);
        smith.passport.setRelease_date("01.01.1985");
        smith.passport.setOrganization("123 отдел полиции какого-то города");

        smith.passport.printPassport();        
        smith.address.setCountry("USA");        
        smith.address.setCity("N-Y");
        smith.address.setStreet("Lenina ave.");
        smith.address.setHouse("124");
        smith.address.setApartment("31");        
        smith.address.setIndex(987654);        
        System.out.println("===========================");        
        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        
        String ivanovname = ivanov.getFullName();
        String smithname = smith.getFullName();
        String ivanovaddr = ivanov.getAddress();
        String smithaddr = smith.getAddress();
        
        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
        
        System.out.println(ivanovname+"\n"+ivanovaddr+"\n"+smithname+"\n"+smithaddr);
    }
}
