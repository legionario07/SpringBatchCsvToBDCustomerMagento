package br.com.batch.databases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.batch.model.CustomerEntity;


@Repository
public interface CustomerEntityRepository extends JpaRepository<CustomerEntity, Integer> {
	
	CustomerEntity findByEmail(String email);

}
