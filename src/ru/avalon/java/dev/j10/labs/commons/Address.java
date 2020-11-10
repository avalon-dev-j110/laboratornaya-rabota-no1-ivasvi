/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons;

public class Address
{
    private int index;
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;
    
    public Address(int index, String country, String city, String street, String house, String apartment)
    {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }
    public Address()
    {
        this(0,"","","","","");
    }
    
    public int getIndex()
    {
        return index;
    }
    
    public String getCountry()
    {
        return country;
    }
    
    public String getCity()
    {
        return city;
    }
    
    public String getStreet()
    {
        return street;
    }
    
    public String getHouse()
    {
        return house;
    }
    
    public String getApartment()
    {
        return apartment;
    }
    
    public void setIndex(int index)
    {
        this.index = index;
    }
    
    public void setCountry(String country)
    {
        this.country = country;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public void setStreet(String street)
    {
        this.street = street;
    }
    
    public void setHouse(String house)
    {
        this.house = house;
    }
    
    public void setApartment(String apartment)
    {
        this.apartment = apartment;
    }
      
}