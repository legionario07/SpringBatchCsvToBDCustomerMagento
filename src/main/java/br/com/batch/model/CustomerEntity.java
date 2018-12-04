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
@Table(name="customer_entity")
public class CustomerEntity {
	
	
	
	@Column(name="entity_id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer entityId;
	
	@Column(name="website_id")
	private Integer webSiteId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="group_id")
	private Integer groupId;
	
	@Column(name="increment_id")
	private String incrementId;

	@Column(name="store_id")
	private Integer storeId;
	
	@Column(name="created_at")
	private Date createdAt;
	
	@Column(name="updated_at")
	private Date updatedAt;
	
	@Column(name="is_active")
	private Integer isActive;
	
	@Column(name="disable_auto_group_change")
	private Integer disableAutoGroupChange;
	
	@Column(name="created_in")
	private String createdIn;
	
	@Column(name="prefix")
	private String prefix;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="middlename")
	private String middleName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="suffix")
	private String suffix;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="password_hash")
	private String passwordHash;
	
	@Column(name="rp_token")
	private String rpToken;
	
	@Column(name="rp_token_created_at")
	private Date rpTokenCreatedAt;
	
	@Column(name="default_billing")
	private Integer defaultBilling;
	
	@Column(name="default_shipping")
	private Integer defaultShipping;
	
	@Column(name="taxvat")
	private String taxVat;
	
	@Column(name="confirmation")
	private String confirmation;
	
	@Column(name="gender")
	private Integer gender;
	
	@Column(name="failures_num")
	private Integer failuresNum;
	
	@Column(name="first_failure")
	private Integer firstFailure;
	
	@Column(name="lock_expires")
	private Integer lockExpires;
	
	
	public CustomerEntity(Integer entityId) {
		this();
		this.entityId = entityId;
		
	}
	
	public CustomerEntity() {
		
	}

	public Integer getEntityId() {
		return entityId;
	}

	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	public Integer getWebSiteId() {
		return webSiteId;
	}

	public void setWebSiteId(Integer webSiteId) {
		this.webSiteId = webSiteId;
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

	public String getIncrementId() {
		return incrementId;
	}

	public void setIncrementId(String incrementId) {
		this.incrementId = incrementId;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
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

	public Integer getDisableAutoGroupChange() {
		return disableAutoGroupChange;
	}

	public void setDisableAutoGroupChange(Integer disableAutoGroupChange) {
		this.disableAutoGroupChange = disableAutoGroupChange;
	}

	public String getCreatedIn() {
		return createdIn;
	}

	public void setCreatedIn(String createdIn) {
		this.createdIn = createdIn;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
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

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getRpTokenVarchar() {
		return rpToken;
	}

	public void setRpTokenVarchar(String rpTokenVarchar) {
		this.rpToken = rpTokenVarchar;
	}

	public Date getRpTokenCreatedAt() {
		return rpTokenCreatedAt;
	}

	public void setRpTokenCreatedAt(Date rpTokenCreatedAt) {
		this.rpTokenCreatedAt = rpTokenCreatedAt;
	}

	public Integer getDefaultBilling() {
		return defaultBilling;
	}

	public void setDefaultBilling(Integer defaultBilling) {
		this.defaultBilling = defaultBilling;
	}

	public Integer getDefaultShipping() {
		return defaultShipping;
	}

	public void setDefaultShipping(Integer defaultShipping) {
		this.defaultShipping = defaultShipping;
	}

	public String getTaxVat() {
		return taxVat;
	}

	public void setTaxVat(String taxVat) {
		this.taxVat = taxVat;
	}

	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}



	public Integer getFirstFailure() {
		return firstFailure;
	}

	public void setFirstFailure(Integer firstFailure) {
		this.firstFailure = firstFailure;
	}

	public Integer getLockExpires() {
		return lockExpires;
	}

	public void setLockExpires(Integer lockExpires) {
		this.lockExpires = lockExpires;
	}

	@Override
	public String toString() {
		return "CustomerEntity [entityId=" + entityId + ", webSiteId=" + webSiteId + ", email=" + email + ", groupId="
				+ groupId + ", incrementId=" + incrementId + ", storeId=" + storeId + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", isActive=" + isActive + ", disableAutoGroupChangeSmallint="
				+ disableAutoGroupChange + ", createdIn=" + createdIn + ", prefix=" + prefix + ", firstName="
				+ firstName + ", middleName=" + middleName + ", suffix=" + suffix + ", dob=" + dob
				+ ", passwordHashVarchar=" + passwordHash + ", rpTokenVarchar=" + rpToken
				+ ", rpTokenCreatedAt=" + rpTokenCreatedAt + ", defaultBilling=" + defaultBilling + ", defaultShipping="
				+ defaultShipping + ", taxVat=" + taxVat + ", confirmation=" + confirmation + ", gender=" + gender
				+ ", firstFailure=" + firstFailure + ", lockExpires=" + lockExpires + "]";
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFailuresNum() {
		return failuresNum;
	}

	public void setFailuresNum(Integer failuresNum) {
		this.failuresNum = failuresNum;
	}


}
