package com.evalueytor.evalueytor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.evalueytor.evalueytor.models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long > {

}

