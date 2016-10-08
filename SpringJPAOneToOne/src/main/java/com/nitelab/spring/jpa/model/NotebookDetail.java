package com.nitelab.spring.jpa.model;

import javax.persistence.*;

/**
 * Created by dph on 08/10/16.
 */
@Entity
public class NotebookDetail {
    private Integer id;
    private Integer numberOfPages;
    private Notebook notebook;

    public NotebookDetail() {
    }

    public NotebookDetail(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "number_of_pages")
    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @OneToOne(mappedBy = "notebookDetail")
    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }
}
