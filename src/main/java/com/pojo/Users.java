package com.pojo;

import java.util.Date;

public class Users {

    private Integer id;

    private String name;

    private String pwd;

    private Integer age;

    private Date time;

    public Users() {
    }

    public Users(Integer id, String name, String pwd, Integer age, Date time) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() { return pwd;
    }

    public void setPwd(String pwd) { this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Users{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", pwd='").append(pwd).append('\'');
        sb.append(", age=").append(age);
        sb.append(", time=").append(time);
        sb.append('}');
        return sb.toString();
    }
}
