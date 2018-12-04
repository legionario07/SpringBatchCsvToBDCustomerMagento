package br.com.batch.databases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.batch.model.CustomerEntityGridFlat;


@Repository
public interface CustomerEntityGridFlatRepository extends JpaRepository<CustomerEntityGridFlat, Integer> {
	

}
