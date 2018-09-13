class HashItem{
	private String key;
	private String value;
	private boolean deleted;
	
	public HashItem(String key, String value) {
		this.key = key;
		this.value = value;
		this.deleted = false;
	}
	public void setDeleted() {
		deleted = true;	
	}
	public boolean isDeleted() {
		return deleted;
	}
	public String getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
}