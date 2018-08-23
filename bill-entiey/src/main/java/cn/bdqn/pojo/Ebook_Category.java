package cn.bdqn.pojo;

import java.io.Serializable;

public class Ebook_Category implements Serializable {
    private Integer id;//分类编号
    private String name;//分类名称

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
}
