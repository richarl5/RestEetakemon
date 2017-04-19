package eetac.dsa.lab.entity;
import eetac.dsa.lab.Dao;

/**
 * Created by Home on 15/04/2017.
 */
public class Eetakemon extends Dao {
    private Integer id;
    private String name;
    private Integer level;

    public Eetakemon()
    {
    }

    public Eetakemon (Integer id, String name, Integer level)
    {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public String getName()
    {
        return name;
    }

    public Integer getLevel()
    {
        return level;
    }

    public Integer getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public void setLevel(Integer level)
    {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Eetakemon [id=" + id + ", name=" + name + ", level=" + level + "]";
    }

    @Override
    public String getPrimaryKey() {
        return "id";
    }

    @Override
    public String getPKMethod() {
        return "getId";
    }
}
