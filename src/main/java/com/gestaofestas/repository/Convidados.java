package com.gestaofestas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaofestas.model.Convidado;

// não precisa da anotação @Repository pq o JpaRepository dá o talento
@Repository
public interface Convidados extends JpaRepository<Convidado, Long> {

}
