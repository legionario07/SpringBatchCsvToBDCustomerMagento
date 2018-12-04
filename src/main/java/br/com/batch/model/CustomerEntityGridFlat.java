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
@Table(name="customer_grid_flat")
public class CustomerEntityGridFlat {
	
	
	
	@Column(name="entity_id")
	@Id
	private Integer entityId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="group_id")
	private Integer groupId;
	
	@Column(name="created_at")
	private Date createdAt;
	
	@Column(name="website_id")
	private Integer webSiteId;
	
	@Column(name="confirmation")
	private String confirmation;

	@Column(name="created_in")
	private String createdIn;

	@Column(name="dob")
	private Date date;
	
	@Column(name="gender")
	private Integer gender;
	
	@Column(name="taxvat")
	private String taxVat;
	
	@Column(name="lock_expires")
	private Date lockExpires;
	
	@Column(name="shipping_full")
	private String shippingFull;
	
	@Column(name="billing_full")
	private String billingFull;
	
	@Column(name="billing_firstname")
	private String billingFirstName;
	
	@Column(name="billing_lastname")
	private String billingLastName;
	
	@Column(name="billing_telephone")
	private String billingTelephone;
	
	@Column(name="billing_postcode")
	private String billingPostCode;
	
	@Column(name="billing_country_id")
	private String billingCountryId;
	
	@Column(name="billing_region")
	private String billingRegion;
	
	@Column(name="billing_street")
	private String billingStreet;
	
	@Column(name="billing_city")
	private String billingCity;
	
	@Column(name="billing_fax")
	private String billingFax;
	
	@Column(name="billing_vat_id")
	private String billingVatId;
	
	@Column(name="billing_company")
	private String billingCompany;
	
	public CustomerEntityGridFlat(Integer entityId) {
		this();
		this.entityId = entityId;
		
	}
	
	public CustomerEntityGridFlat() {
		
	}

	public Integer getEntityId() {
		return entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getWebSiteId() {
		return webSiteId;
	}

	public void setWebSiteId(Integer webSiteId) {
		this.webSiteId = webSiteId;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public String getCreatedIn() {
		return createdIn;
	}

	public void setCreatedIn(String createdIn) {
		this.createdIn = createdIn;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getTaxVat() {
		return taxVat;
	}

	public void setTaxVat(String taxVat) {
		this.taxVat = taxVat;
	}

	public Date getLockExpires() {
		return lockExpires;
	}

	public void setLockExpires(Date lockExpires) {
		this.lockExpires = lockExpires;
	}

	public String getShippingFull() {
		return shippingFull;
	}

	public void setShippingFull(String shippingFull) {
		this.shippingFull = shippingFull;
	}

	public String getBillingFull() {
		return billingFull;
	}

	public void setBillingFull(String billingFull) {
		this.billingFull = billingFull;
	}

	public String getBillingFirstName() {
		return billingFirstName;
	}

	public void setBillingFirstName(String billingFirstName) {
		this.billingFirstName = billingFirstName;
	}

	public String getBillingLastName() {
		return billingLastName;
	}

	public void setBillingLastName(String billingLastName) {
		this.billingLastName = billingLastName;
	}

	public String getBillingPostCode() {
		return billingPostCode;
	}

	public void setBillingPostCode(String billingPostCode) {
		this.billingPostCode = billingPostCode;
	}

	public String getBillingCountryId() {
		return billingCountryId;
	}

	public void setBillingCountryId(String billingCountryId) {
		this.billingCountryId = billingCountryId;
	}

	public String getBillingRegion() {
		return billingRegion;
	}

	public void setBillingRegion(String billingRegion) {
		this.billingRegion = billingRegion;
	}

	public String getBillingStreet() {
		return billingStreet;
	}

	public void setBillingStreet(String billingStreet) {
		this.billingStreet = billingStreet;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public String getBillingFax() {
		return billingFax;
	}

	public void setBillingFax(String billingFax) {
		this.billingFax = billingFax;
	}

	public String getBillingVatId() {
		return billingVatId;
	}

	public void setBillingVatId(String billingVatId) {
		this.billingVatId = billingVatId;
	}

	public String getBillingCompany() {
		return billingCompany;
	}

	public void setBillingCompany(String billingCompany) {
		this.billingCompany = billingCompany;
	}

	@Override
	public String toString() {
		return "CustomerGridFlat [entityId=" + entityId + ", name=" + name + ", email=" + email + ", groupId=" + groupId
				+ ", createdAt=" + createdAt + ", webSiteId=" + webSiteId + ", confirmation=" + confirmation
				+ ", createdIn=" + createdIn + ", date=" + date + ", gender=" + gender + ", taxVat=" + taxVat
				+ ", lockExpires=" + lockExpires + ", shippingFull=" + shippingFull + ", billingFull=" + billingFull
				+ ", billingFirstName=" + billingFirstName + ", billingLastName=" + billingLastName
				+ ", billingPostCode=" + billingPostCode + ", billingCountryId=" + billingCountryId + ", billingRegion="
				+ billingRegion + ", billingStreet=" + billingStreet + ", billingCity=" + billingCity + ", billingFax="
				+ billingFax + ", billingVatId=" + billingVatId + ", billingCompany=" + billingCompany + "]";
	}

	public String getBillingTelephone() {
		return billingTelephone;
	}

	public void setBillingTelephone(String billingTelephone) {
		this.billingTelephone = billingTelephone;
	}


}
