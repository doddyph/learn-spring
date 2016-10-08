package com.nitelab.spring.jpa.model;

import javax.persistence.*;

/**
 * Created by dph on 08/10/16.
 */
@Entity
public class Notebook {
    private int id;
    private String name;
    private NotebookDetail notebookDetail;

    public Notebook() {
    }

    public Notebook(String name) {
        this.name = name;
    }

    public Notebook(String name, NotebookDetail notebookDetail) {
        this.name = name;
        this.notebookDetail = notebookDetail;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "notebook_detail_id")
    public NotebookDetail getNotebookDetail() {
        return notebookDetail;
    }

    public void setNotebookDetail(NotebookDetail notebookDetail) {
        this.notebookDetail = notebookDetail;
    }
}
