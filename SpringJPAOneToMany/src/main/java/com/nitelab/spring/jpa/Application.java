package com.nitelab.spring.jpa;

import com.nitelab.spring.jpa.model.Company;
import com.nitelab.spring.jpa.model.Employee;
import com.nitelab.spring.jpa.repository.CompanyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dph on 08/10/16.
 * Links:
 * http://mrbool.com/rest-server-with-spring-data-spring-boot-and-postgresql/34023
 * https://hellokoding.com/jpa-one-to-many-relationship-mapping-example-with-spring-boot-maven-and-mysql/
 * http://www.javatips.net/blog/hibernate-jpa-one-to-many-relation-mapping-example
 * http://www.javatips.net/blog/hibernate-jpa-many-to-one-relation-mapping-example
 */
@SpringBootApplication
@EntityScan(basePackages = "com.nitelab.spring.jpa.model")
@EnableJpaRepositories(basePackages = "com.nitelab.spring.jpa.repository")
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    /*@Autowired
    ClientRepository repository;*/

    /*@Autowired
    private BookCategoryRepository repository;*/

    @Autowired
    private CompanyRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /* Client clientA = new Client("John", "13th Avenue, 1234", "1275634");
        repository.save(clientA);*/

        /*// save a couple of categories
        BookCategory categoryA = new BookCategory("Category A");
        Set bookAs = new HashSet<Book>(){{
            add(new Book("Book A1", categoryA));
            add(new Book("Book A2", categoryA));
            add(new Book("Book A3", categoryA));
        }};
        categoryA.setBooks(bookAs);

        BookCategory categoryB = new BookCategory("Category B");
        Set bookBs = new HashSet<Book>(){{
            add(new Book("Book B1", categoryB));
            add(new Book("Book B2", categoryB));
            add(new Book("Book B3", categoryB));
        }};
        categoryB.setBooks(bookBs);

        repository.save(new HashSet<BookCategory>() {{
            add(categoryA);
            add(categoryB);
        }});*/

        Company SRIN = new Company(
                "SRIN",
                "Jendral Sudirman St.",
                "South Jakarta",
                "DKI Jakarta",
                "Indonesia");

        Set employees = new HashSet<Employee>() {{
            add(new Employee("Doddy"));
            add(new Employee("Leo"));
            add(new Employee("Indra"));
        }};

        SRIN.setEmployees(employees);

        repository.save(new HashSet<Company>() {{
            add(SRIN);
        }});
    }
}
