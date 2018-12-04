package br.com.batch.databases.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.batch.model.DirectoryCountryRegion;


@Repository
public interface DirectoryCountryRegionRepository extends CrudRepository<DirectoryCountryRegion, Integer> {
	

}
