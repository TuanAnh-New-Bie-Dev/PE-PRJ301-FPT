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
public class Paper {

    private int paperid;
    private String title;
    private String publisheddate;

    public Paper() {
    }

    public Paper(int paperid, String title, String publisheddate) {
        this.paperid = paperid;
        this.title = title;
        this.publisheddate = publisheddate;
    }

    public int getPaperid() {
        return paperid;
    }

    public void setPaperid(int paperid) {
        this.paperid = paperid;
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
        return "Paper{" + "paperid=" + paperid + ", title=" + title + ", publisheddate=" + publisheddate + '}';
    }

}
