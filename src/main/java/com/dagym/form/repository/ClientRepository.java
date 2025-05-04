package com.dagym.form.repository;
import com.dagym.form.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}