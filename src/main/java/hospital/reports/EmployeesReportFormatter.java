package hospital.reports;

import hospital.domain.Employee;

/**
 * Created by gbelot on 06-10-17.
 */
public class EmployeesReportFormatter extends ReportFormatter {

    public EmployeesReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    public String getFormattedEmploee()
    {
        return getFormatterOutput();
    }

}
