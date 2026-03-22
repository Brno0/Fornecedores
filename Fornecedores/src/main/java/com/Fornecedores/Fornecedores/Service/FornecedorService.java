package com.Fornecedores.Fornecedores.Service;

import com.Fornecedores.Fornecedores.Entity.Fornecedor;
import com.Fornecedores.Fornecedores.Repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    private final FornecedorRepository repository;

    public FornecedorService(FornecedorRepository repository) {
        this.repository = repository;
    }

    public Fornecedor salvar(Fornecedor fornecedor) {
        return repository.save(fornecedor);
    }

    public List<Fornecedor> listarTodos() {
        return repository.findAll();
    }

    public Fornecedor buscarPorId(Long id) {
        Optional<Fornecedor> fornecedor = repository.findById(id);
        return fornecedor.orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}