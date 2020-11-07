package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    
    public Passport passport;
    public Address address;
    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() 
    {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        String fullname;
        if (!passport.getName().equals("")&&!passport.getSurname().equals("")) 
        {
            fullname = passport.getName()
                    +((!passport.getSecond_name().equals("")&&passport.getPatronymic().equals("")) ? " " + passport.getSecond_name().substring(0,1)+".":"") //Если есть вторе имя, но нет отчества
                    + " " + passport.getSurname()
                    + ((!passport.getPatronymic().equals("")&&passport.getSecond_name().equals("")) ? (" " + passport.getPatronymic()):"") //Если есть отчество, но нет второго имени
                    ; 
            return fullname;
        }

        return null;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        
        return "Адрес: " + String.valueOf(address.getIndex()) + ", " + address.getCountry() + ", " + address.getCity()+ ", " + address.getStreet()+ ", " + address.getHouse()+ "-" + address.getApartment();
    }
    
    public Person(String name, String surname, String patronymic, String second_name)
    {
        passport = new Passport(name, surname, patronymic, second_name);
        address = new Address();
    }
    
     public Person(String name, String surname)
    {
        passport = new Passport(name, surname);
        address = new Address();
    }   
    
     public Person()
     {
         passport = new Passport("","");
         address = new Address();
     }
    
}