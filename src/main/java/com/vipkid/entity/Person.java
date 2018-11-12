package com.vipkid.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author zhangshiqi1
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person implements Serializable {

    private static final long serialVersionUID = -7689556197339086956L;
    private String name;
    private Integer age;
    private Map<String,String > pet;
    private List<String> hobbys;
    private List<Map<String,Object>> childs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Map<String, String> getPet() {
        return pet;
    }

    public void setPet(Map<String, String> pet) {
        this.pet = pet;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public List<Map<String, Object>> getChilds() {
        return childs;
    }

    public void setChilds(List<Map<String, Object>> childs) {
        this.childs = childs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age) &&
                Objects.equals(pet, person.pet) &&
                Objects.equals(hobbys, person.hobbys) &&
                Objects.equals(childs, person.childs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, pet, hobbys, childs);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                ", hobbys=" + hobbys +
                ", childs=" + childs +
                '}';
    }
}
