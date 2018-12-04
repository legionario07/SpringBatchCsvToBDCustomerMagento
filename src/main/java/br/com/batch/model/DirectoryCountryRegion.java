package br.com.batch.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.batch.model.enums.CatalogProdutoType;

@Entity
@Table(name="directory_country_region")
public class DirectoryCountryRegion {
	
	
	@Column(name="region_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer regionId;
	
	@Column(name="country_id")
	private String countryId;
	
	@Column(name="code")
	private String code;
	
	@Column(name="default_name")
	private String defaultName;
	
	
	public DirectoryCountryRegion(Integer regionId) {
		this();
		this.regionId = regionId;
		
	}
	
	public DirectoryCountryRegion() {
		
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDefaultName() {
		return defaultName;
	}

	public void setDefaultName(String defaultName) {
		this.defaultName = defaultName;
	}

	@Override
	public String toString() {
		return "DirectoryCountryRegion [regionId=" + regionId + ", countryId=" + countryId + ", code=" + code
				+ ", defaultName=" + defaultName + "]";
	}
	

}
