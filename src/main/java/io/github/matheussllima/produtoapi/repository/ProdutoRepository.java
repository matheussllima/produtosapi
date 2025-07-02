package io.github.matheussllima.produtoapi.repository;

import io.github.matheussllima.produtoapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
