package crm.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Country {
	private static final List<Country> COUNTRIES;

	private final String code;
	private final String name;

	static {
		List<Country> temp = new ArrayList<Country>();
		temp.add(new Country("US", "United States"));
		temp.add(new Country("IN", "India"));

		COUNTRIES = Collections.unmodifiableList(temp);
	}

	public static List<Country> getCountries() {
		return COUNTRIES;
	}

	public Country(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}
}
