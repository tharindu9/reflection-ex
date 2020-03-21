package utill;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ClassEx {

	public static void main(String[] args) {

		String x = "Tharindu";
		
		checkConstractors(x);
		checkMethods(x);
		checkFields(x);
	}

	private static void checkConstractors(String x) {
		Map<String, Object> values = new HashMap<String, Object>();

		for (Constructor constractors : x.getClass().getDeclaredConstructors()) {
			values.put(constractors.getName(), x);
		}
		System.out.println(values);
	}

	private static void checkMethods(String x) {
		Map<String, Object> values = new HashMap<String, Object>();

		for (Method methods : x.getClass().getDeclaredMethods()) {
			values.put(methods.getName(), x);
		}
		System.out.println(values);
	}

	private static void checkFields(String x) {
		Map<String, Object> values = new HashMap<String, Object>();

		for (Field fields : x.getClass().getDeclaredFields()) {
			values.put(fields.getName(), x);
		}

		System.out.println(values);
	}

}
