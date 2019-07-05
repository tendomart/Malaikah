package com.malaikamedical.service;

import java.util.Optional;

public interface Mservice <Entity>{
	Iterable<Entity> getAllItems();
	
	 void addItem(Entity fm);
	
	 Optional<Entity> getItemById(int id);
	
	 Entity findAllById(Iterable<Integer> ids);
	 void removeItem(int id);
	
	 void removeItemByName(Entity bio);
	
	 void removeAllItems();
}
