/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author tuan anh
 */
public class Author {

    private int authorid;
    private String authorname;

    public Author() {
    }

    public Author(int authorid, String authorname) {
        this.authorid = authorid;
        this.authorname = authorname;
    }

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    @Override
    public String toString() {
        return "Author{" + "authorid=" + authorid + ", authorname=" + authorname + '}';
    }

}
