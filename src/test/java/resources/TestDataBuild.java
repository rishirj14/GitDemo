package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.location;

public class TestDataBuild {
public AddPlace addPlacePayLoad(String name, String language, String address)
{
	AddPlace p = new AddPlace();
	p.setAccuracy(50);
	p.setAddress(address);
	p.setLanguage(language);
	p.setName(name);
	p.setPhone_number("(+91) 983 893 3937");
	p.setWebsite("http://google.com");

	location l = new location();
	l.setLat(-38.383494);
	l.setLng(33.427362);

	p.setLocation(l);

	List<String> list = new ArrayList();
	list.add("shoe park");
	list.add("shop");

	p.setTypes(list);
	
	return p;
}
public String deleteplacePayload(String place_id)
{
	
	return "{\r\n\r\n    \"place_id\":\""+place_id+"\"\r\n}\r\n";
	
}



}
