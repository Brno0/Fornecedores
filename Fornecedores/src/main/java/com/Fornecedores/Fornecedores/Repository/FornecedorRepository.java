package com.Fornecedores.Fornecedores.Repository;

import com.Fornecedores.Fornecedores.Entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}