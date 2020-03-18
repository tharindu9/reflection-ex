package factory;

import shoes.AbstractShoe;

public class Shoe {

	private AbstractShoe shoe;
	public AbstractShoe createShoe(String fullQualifiedName) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class c = Class.forName(fullQualifiedName);
		shoe = (AbstractShoe) c.newInstance();
		return shoe;
	}
}
