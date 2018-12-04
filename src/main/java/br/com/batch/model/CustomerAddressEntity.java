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
@Table(name="customer_address_entity")
public class CustomerAddressEntity {
	
	
	
	@Column(name="entity_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer entityId;
	
	@Column(name="increment_id")
	private String incrementID;
	
	@Column(name="parent_id")
	private Integer parentID;
	
	@Column(name="created_at")
	private Date createdAt;
	
	@Column(name="updated_at")
	private Date updatedAt;
	
	@Column(name="is_active")
	private Integer isActive;
	
	@Column(name="city")
	private String city;
	
	@Column(name="company")
	private String company;
	
	@Column(name="country_id")
	private String countryId;
	
	@Column(name="fax")
	private String fax;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="middlename")
	private String middleName;
	
	@Column(name="postcode")
	private String postCode;
	
	@Column(name="prefix")
	private String prefix;
	
	@Column(name="region")
	private String region;
	
	@Column(name="region_id")
	private Integer regionId;
	
	@Column(name="street")
	private String street;
	
	@Column(name="suffix")
	private String suffix;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="vat_id")
	private String vatId;
	
	@Column(name="vat_is_valid")
	private Integer vatIsValid;
	
	@Column(name="vat_request_date")
	private String vatRequestDate;
	
	@Column(name="vat_request_id")
	private String vatRequestId;
	
	@Column(name="vat_request_success")
	private Integer vatRequestSucess;
	
	
	public CustomerAddressEntity(Integer entityId) {
		this();
		this.entityId = entityId;
		
	}
	
	public CustomerAddressEntity() {
		
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

	public Integer getEntityId() {
		return entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public String getIncrementID() {
		return incrementID;
	}

	public void setIncrementID(String incrementID) {
		this.incrementID = incrementID;
	}

	public Integer getParentID() {
		return parentID;
	}

	public void setParentID(Integer parentID) {
		this.parentID = parentID;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getVatId() {
		return vatId;
	}

	public void setVatId(String vatId) {
		this.vatId = vatId;
	}

	public Integer getVatIsValid() {
		return vatIsValid;
	}

	public void setVatIsValid(Integer vatIsValid) {
		this.vatIsValid = vatIsValid;
	}



	@Override
	public String toString() {
		return "CustomerAddressEntity [entityId=" + entityId + ", incrementID=" + incrementID + ", parentID=" + parentID
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", isActive=" + isActive + ", city=" + city
				+ ", company=" + company + ", countryId=" + countryId + ", fax=" + fax + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", postCode=" + postCode + ", prefix=" + prefix + ", region=" + region
				+ ", regionId=" + regionId + ", street=" + street + ", suffix=" + suffix + ", telephone=" + telephone
				+ ", vatId=" + vatId + ", vatIsValid=" + vatIsValid + "]";
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getVatRequestDate() {
		return vatRequestDate;
	}

	public void setVatRequestDate(String vatRequestDate) {
		this.vatRequestDate = vatRequestDate;
	}

	public String getVatRequestId() {
		return vatRequestId;
	}

	public void setVatRequestId(String vatRequestId) {
		this.vatRequestId = vatRequestId;
	}

	public Integer getVatRequestSucess() {
		return vatRequestSucess;
	}

	public void setVatRequestSucess(Integer vatRequestSucess) {
		this.vatRequestSucess = vatRequestSucess;
	}


	

}
