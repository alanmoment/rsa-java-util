package com.encrypt;

/**
 * Created by alan on 2014/11/4.
 */
public class User {

    /**
     * Account ID
     */
    private String id;

    /**
     * Without account ID unique ID
     */
    private String uuid;

    /**
     * Person age
     */
    private String age;

    /**
     * Person gender
     */
    private String gender;

    private String created;
    private String updated;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return this.age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getCreated() {
        return this.created;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getUpdated() {
        return this.updated;
    }

}
