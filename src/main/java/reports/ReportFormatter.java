package reports;

/**
 * Created by gbelot on 06-10-17.
 */
public class ReportFormatter {

    String formatterOutput;

    public ReportFormatter(Object object, FormatType formatType)
    {
        switch (formatType){
            case XML:
                formatterOutput = convertObjectToXML(object);
                break;
            case CSV:
                formatterOutput = convertObjectToCVS(object);
                break;
        }
    }

    private String convertObjectToXML(Object object) {
        return "XML : <title>" + object.toString() + "</title>";
    }

    private String convertObjectToCVS(Object object) {
        return "CSV : ,,,," + object.toString() + ",,,,,";
    }

    public String getFormatterOutput() {
        return formatterOutput;
    }

}
