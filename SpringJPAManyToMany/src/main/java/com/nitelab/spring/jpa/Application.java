package com.nitelab.spring.jpa;

import com.nitelab.spring.jpa.model.Acara;
import com.nitelab.spring.jpa.model.Karyawan;
import com.nitelab.spring.jpa.repository.AcaraRepository;
import com.nitelab.spring.jpa.repository.KaryawanRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.HashSet;

/**
 * Created by dph on 08/10/16.
 * Link:
 * https://hellokoding.com/jpa-many-to-many-relationship-mapping-example-with-spring-boot-maven-and-mysql/
 * http://www.javatips.net/blog/hibernate-jpa-many-to-many-relation-mapping-example
 */
@SpringBootApplication
@EntityScan(basePackages = "com.nitelab.spring.jpa.model")
@EnableJpaRepositories(basePackages = "com.nitelab.spring.jpa.repository")
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    /*@Autowired
    private BukuRepository bukuRepository;

    @Autowired
    private PenerbitRepository penerbitRepository;*/

    @Autowired
    private KaryawanRepository karyawanRepository;

    @Autowired
    private AcaraRepository acaraRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*// save a couple of books
        Penerbit publisherA = new Penerbit("Publisher A");
        Penerbit publisherB = new Penerbit("Publisher B");
        Penerbit publisherC = new Penerbit("Publisher C");

        bukuRepository.save(new HashSet<Buku>(){{
            add(new Buku("Book A", new HashSet<Penerbit>(){{
                add(publisherA);
                add(publisherB);
            }}));

            add(new Buku("Book B", new HashSet<Penerbit>(){{
                add(publisherA);
                add(publisherC);
            }}));
        }});

        // save a couple of publishers
        Buku bookA = new Buku("Book A");
        Buku bookB = new Buku("Book B");

        penerbitRepository.save(new HashSet<Penerbit>() {{
            add(new Penerbit("Publisher A", new HashSet<Buku>() {{
                add(bookA);
                add(bookB);
            }}));

            add(new Penerbit("Publisher B", new HashSet<Buku>() {{
                add(bookA);
                add(bookB);
            }}));
        }});*/

        Acara acaraA = new Acara("Acara A");
        Acara acaraB = new Acara("Acara B");
        Acara acaraC = new Acara("Acara C");

        karyawanRepository.save(new HashSet<Karyawan>() {{
            add(new Karyawan("Karyawan A", new HashSet<Acara>() {{
                add(acaraA);
                add(acaraB);
            }}));

            add(new Karyawan("Karyawan B", new HashSet<Acara>() {{
                add(acaraB);
                add(acaraC);
            }}));
        }});

        Karyawan karyawanA = new Karyawan("Karyawan A");
        Karyawan karyawanB = new Karyawan("Karyawan B");

        acaraRepository.save(new HashSet<Acara>(){{
            add(new Acara("Acara A", new HashSet<Karyawan>(){{
                add(karyawanA);
            }}));

            add(new Acara("Acara B", new HashSet<Karyawan>(){{
                add(karyawanA);
                add(karyawanB);
            }}));

            add(new Acara("Acara C", new HashSet<Karyawan>(){{
                add(karyawanB);
            }}));
        }});
    }
}
