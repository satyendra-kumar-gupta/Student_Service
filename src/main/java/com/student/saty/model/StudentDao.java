package com.student.saty.model;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class StudentDao {

    @PersistenceContext
    EntityManager em;

    public void insertStudent(Student stu){
        em.persist(stu);
    }
}
