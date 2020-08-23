package summative2;

public class ConverterIf implements Converter {

    @Override
    public String convertMonth(int monthNumber) {
	String month = null;
	if (monthNumber == 1) {
	    month = "January";
	} else if (monthNumber == 2) {
	    month = "February";
	} else if(monthNumber == 3) {
	    month = "March";
	}//more else if till December
	return month;
    }

    @Override
    public String convertDay(int dayNumber) {
	String day = null;
	if(dayNumber == 1) {
	    day = "Monday";
	} else if (dayNumber == 2) {
	    day = "Tuesday";
	} //more else if till Sunday
	return day;
    }

}
