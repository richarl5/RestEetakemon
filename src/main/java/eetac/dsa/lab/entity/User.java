package eetac.dsa.control1.entity;

import eetac.dsa.control1.EetakemonManagerDB;

import java.util.List;

/**
 * Created by Home on 28/02/2017.
 */
public class User extends EetakemonManagerDB implements Comparable<User>{
    private Integer id;
    private String name;
    //private List<Uobject> objectlist;

    public User() {
    }
    public User(Integer id, String name/*, List<Uobject> objectlist*/){
        this.id = id;
        this.name = name;
        //this.objectlist = objectlist;
    }

    public String getName()
    {
        return name;
    }

    public Integer getId()
    {
        return id;
    }

    /*public List<Uobject> getObjectlist()
    {
        return objectlist;
    }*/

    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    /*public void setObjectlist(List<Uobject> objects)
    {
        this.objectlist = objects;
    }*/

    public String getPrimaryKey() {
        return "id";
    }

    public String getPKMethod() {
        return "getId";
    }


    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + /*", objects=" + objectlist + */"]";
    }

    @Override
    public int compareTo(User u) {
        String a=new String(this.getName());
        String b=new String(u.getName());
        return a.compareTo(b);
    }
}
