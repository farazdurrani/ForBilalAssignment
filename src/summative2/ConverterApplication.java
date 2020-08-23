package summative2;

public class ConverterApplication {
    public static void main(String[] args) {
	Converter con1 = new ConverterIf();
	Converter con2 = new ConverterSwitch();
	System.out.println(con1.convertDay(1));
	System.out.println(con2.convertDay(1));
	System.out.println(con1.convertMonth(1));
	System.out.println(con2.convertMonth(1));
    }
}
