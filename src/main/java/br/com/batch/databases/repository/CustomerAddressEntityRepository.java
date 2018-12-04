package br.com.batch.databases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.batch.model.CustomerAddressEntity;


@Repository
public interface CustomerAddressEntityRepository extends JpaRepository<CustomerAddressEntity, Integer> {
	

}
