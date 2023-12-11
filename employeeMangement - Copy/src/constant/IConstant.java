package constant;

/**
 * The IConstant interface defines a set of constant values used for string
 * pattern matching and validations in the application. The constants include
 * regular expression patterns for matching numbers, email addresses, dates as
 * well as a pattern for matching a code string composed of digits and
 * alphanumeric characters.
 */
public interface IConstant {

    String REGEX_NUMBER = "^\\d+$";

    String REGEX_EMAIL = "^[\\w-\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

    String REGEX_DATE = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|"
            + "(?:(?:29|30)(\\/|-|\\.)"
            + "(?:0?[1,3-9]|1[0-2])\\2))"
            + "(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$"
            + "|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)"
            + "?(?:0[48]|[2468][048]|[13579][26])|"
            + "(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]"
            + "|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])"
            + "|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    String CODE = "[\\d\\w]+";
}