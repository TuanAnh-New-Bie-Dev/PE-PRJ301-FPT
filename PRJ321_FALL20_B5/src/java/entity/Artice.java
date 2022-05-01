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
public class Artice {

    private int articleid;
    private String title;
    private String publisheddate;

    public Artice() {
    }

    public Artice(int articleid, String title, String publisheddate) {
        this.articleid = articleid;
        this.title = title;
        this.publisheddate = publisheddate;
    }

    public int getArticleid() {
        return articleid;
    }

    public void setArticleid(int articleid) {
        this.articleid = articleid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisheddate() {
        return publisheddate;
    }

    public void setPublisheddate(String publisheddate) {
        this.publisheddate = publisheddate;
    }

    @Override
    public String toString() {
        return "Artice{" + "articleid=" + articleid + ", title=" + title + ", publisheddate=" + publisheddate + '}';
    }

}
