
public enum EnumResources {
	
	CITIES("CITIES.txt"),
	COUNTRIES("COUNTRIES.txt"),
	FIRST_NAMES_F("FIRST_NAMES_F.txt"),
	FIRST_NAMES_M("FIRST_NAMES_M.txt"),
	PATRONYMIC_F("PATRONYMIC_F.txt"),
	PATRONYMIC_M("PATRONYMIC_M.txt"),
	REGIONS("REGIONS.txt"),
	SECOND_NAMES_F("SECOND_NAMES_F.txt"),
	SECOND_NAMES_M("SECOND_NAMES_M.txt"),
	STREETS("STREETS.txt");
	
	private String nameRes;
	
	private EnumResources(String nameRes) {
		// TODO Auto-generated constructor stub
		this.nameRes = nameRes;
	}
	
	public String getNameRes(){
		return nameRes;
	}
	
	

}
