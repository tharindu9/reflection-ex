package application;

import java.lang.reflect.Field;

import factory.Shoe;
import shoes.AbstractShoe;
import shoes.Bettence;

public class MainApplication {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
       MainApplication ma = new MainApplication();
       Class bClass = Bettence.class;
       String name = bClass.getName();
       String outPut =   ma.callToShoe(name).getName();
       System.out.println(outPut);
       
       Field field = AbstractShoe.class.getDeclaredField("name");
       field.setAccessible(true);
       field.set(AbstractShoe.class.newInstance(), "sample value");
       System.out.println(field.get(AbstractShoe.class.newInstance()));
       
	}
	
	public AbstractShoe callToShoe(String fullyQualifiedName) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		AbstractShoe as = new Shoe().createShoe(fullyQualifiedName);
		return as;
	}
}
