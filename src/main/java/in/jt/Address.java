package in.jt;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String cityName = "Hyderabad";
	private String stateName = "Telangana";
	
	public Address() {
		System.out.println("Address :: Zero :: Constructor");
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", stateName=" + stateName + "]";
	}
	
	
}
