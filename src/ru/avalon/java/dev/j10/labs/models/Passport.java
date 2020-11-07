package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
    
    // Атрибуты класса
    private short ser;// серия паспорта
    private int numb;// номер паспорта
    private String name;// имя    
    private String surname;// фамилия
    private String patronymic;// отчество
    private String second_name;// второе имя
    private String birthday;// день рождения
    private String release_date;// дата выдачи
    private String organization; // орган, выдавший документ.
    
    // Геттеры
    public short getSer()
    {
        return ser;
    }
    public int getNumb()
    {
        return numb;
    }
    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }    
    public String getPatronymic()
    {
        return patronymic;
    }
    public String getSecond_name()
    {
        return second_name;
    }
    public String getBirthday()
    {
        return birthday;
    }    
    public String getRelease_date()
    {
        return release_date;
    } 
    public String getOrganization()
    {
        return organization;
    }     
    
    // Сеттеры
    public void setSer(short ser)
    {
        this.ser = ser;
    }
    public void setNumb(int numb)
    {
        this.numb = numb;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }    
    public void setPatronymic(String patronymic)
    {
        this.patronymic = patronymic;
    }    
    public void setSecond_name(String second_name)
    {
        this.second_name = second_name;
    }
    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }
    public void setRelease_date(String release_date)
    {
        this.release_date = release_date;
    }
    public void setOrganization(String organization)
    {
        this.organization = organization;
    }
    
    public Passport(short ser, int numb, String name, String surname, String patronymic, String second_name, String birthday, String release_date, String organization)
    {
        this.ser = ser;
        this.numb = numb;  
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.second_name = second_name;    
        this.birthday = birthday;
        this.release_date = release_date;
        this.organization = organization;           
    }    

    
    public Passport(String name, String surname, String patronymic, String second_name)
    {
        this((short)0, 0, name, surname, patronymic, second_name, "", "", "");
    }          

    public Passport(String name, String surname)
    {
        this((short)0, 0, name, surname, "", "", "", "", "");
    }    
        
    public void printPassport()
    {
        System.out.println("Серия и номер: " + ser + " " + numb + "\n Имя: " + name + "\n Фамилия: " + surname 
                + "\n Отчество: " + patronymic + "\n Второе имя: " + second_name + "\n Родился: " + birthday 
                + "\n Получил паспорт: " + release_date + "\n Кем выдан: " + organization);
    }
}
