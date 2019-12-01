package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String description;
    private int isAdmin;
    private int groupID;
    private List<Integer> grades;

    public int getGroup () {
        return groupID;
    }

    public void setGroup (int group) {
        this.groupID = group;
    }

    public String getUsername () {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }

    public User(String username, String password ,int isAdmin){
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        grades = new ArrayList<Integer>();
    }

    public User(String username, String password , int isAdmin, String description, int groupID, List<Integer> grades){
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.description = description;
        this.groupID = groupID;
        this.grades = grades;
    }




    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public String getPassword () {
        return password;
    }

    public int getIsAdmin () {
        return isAdmin;
    }

    public void setIsAdmin (int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public int getGroupID () {
        return groupID;
    }

    public void setGroupID (int groupID) {
        this.groupID = groupID;
    }

    public List<Integer> getGrades () {
        return grades;
    }

    public void setGrades (List<Integer> grades) {
        this.grades = grades;
    }

    public int getGradeById(int id){
        return grades.indexOf(id);
    }
}
