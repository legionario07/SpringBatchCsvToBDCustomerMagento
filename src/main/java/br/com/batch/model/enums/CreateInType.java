package br.com.batch.model.enums;

public enum CreateInType {

	DEFAULT_STORE_VIEW("Default Store View");
	
	private String value;
	
	private CreateInType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
