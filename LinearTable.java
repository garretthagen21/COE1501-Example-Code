

class LinearTable{
	public final int size = 7;
	public HashItem[] table = new HashItem[size];
	
	public int code(String key) {
		return (Math.abs(key.hashCode())%size);
	}
	public boolean add(String key,String value) {
		int prob;
		int code = code(key);
		
		if(table[code] == null) {
			table[code] = new HashItem(key,value);
			prob = -1;
		}
		else {
			
			//We have reached the end of the table
			if(code == table.length-1) {
				prob = 0;
			}
			//advance to next postion
			else {
				prob = code+1;
			}
			while ((prob != -1) && (prob !=code)){
				if((table[prob]) == null || table[prob].isDeleted()) {
					table[prob] = new HashItem(key,value);
				}
				else {
					if(prob == table.length-1){
						prob = 0;
					}
					else {
						prob++;
					}
				}
			}
			if (prob != -1) {
				return false;
			}
			else {
			 return true;
			}
			
				
			
		}
		return false;
	}
	
	public boolean delete(String key) {
		int prob;
		int code = code(key);
		
		if(table[code] == null) {
			System.out.println("The space is empty, cannot be deleted");
			return false;
		}
		else if(table[code].getKey().equals(key)) {
			table[code].setDeleted();
			prob = -1;
			return true;
		}
		else {
			if(code == table.length-1) {
				prob = 0;
			}
			else {
				prob = code+1;
			}
			
			while((prob != -1) && (prob != code)) {
				if (table[prob] == null) {
					System.out.println("No matched key found!");
					return false;
				}
				else if(table[prob].getKey().equals(key)) {
					table[prob].setDeleted();
					return true;
				}
				else {
					if(code == (table.length-1)) {
						prob = 0;
					}
					else {
						prob++;
					}
				}
			}
		}
	
		return false;
	
	
	
	
	}
	
	
	
	
}