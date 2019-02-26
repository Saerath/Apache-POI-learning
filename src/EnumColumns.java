
public enum EnumColumns {
	FIRST_NAME("first name"),
	SECOND_NAME("second name"),
	PATRONYMIC("patronymic"),
	AGE("age"),
	GENDER("gender"),
	DATE_BIRTH("date birth"),
	INN("inn"),
	POSTCODE("postcode"),
	COUNTRY("country"),
	REGION("region"),
	CITY("city"),
	STREET("street"),
	HOUSE("house"),
	FLAT("flat");
	
	private String name;
	
	private EnumColumns(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
