package assignment2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class DateValidator extends ReadPdf {

		private Pattern sample;
		private Matcher matcher;

    private static final String DateRegex = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";

    public DateValidator()
    {
    	sample = Pattern.compile(DateRegex );
    }

    public boolean validDate(final String date) {
    

        matcher = sample.matcher(date);

        if (matcher.matches()) {
            matcher.reset();

            if (matcher.find()) {
                String day = matcher.group(1);
                String month = matcher.group(2);
               
                if (day.equals("31") && (month.equals("4") || month.equals("6")
                        || month.equals("9") || month.equals("11")))
                    {     
               
                    	return false; // only 2,4,6,9,11 has 30 days
                    }
          
                else
                {
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
