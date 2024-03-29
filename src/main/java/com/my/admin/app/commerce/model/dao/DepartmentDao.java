package com.my.admin.app.commerce.model.dao;

import com.my.admin.app.commerce.model.document.Department;
import com.my.admin.app.commerce.model.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class DepartmentDao {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Flux<Department> findAll(){ return this.departmentRepository.findAll(); }

    public Mono<Department> findById(String id){ return this.departmentRepository.findById(id); }

    public Mono<Department> save(Department department){ return this.departmentRepository.save(department); }

    public Mono<?> deleteById(String id) {return this.departmentRepository.deleteById(id); }
}
