package net.learning.HttpServletRequest.Attribute.validator;

import net.learning.HttpServletRequest.Attribute.utils.CommonUtils;
import net.learning.HttpServletRequest.Attribute.utils.Constants;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class TicketValidator {

    public void validation(String ticketNumber) {

        if (!ticketNumber.isEmpty() && ticketNumber.length() > 9) {
            CommonUtils.addErrorToList(Constants.ERROR_CODE_2, Constants.ERROR_MESSAGE_2);
        }

        // Check if the ticket number matches the pattern (starts with "ABC")
        if (!ticketNumber.isEmpty() && !Pattern.compile(Constants.PATTERN).matcher(ticketNumber).matches())
            CommonUtils.addErrorToList(Constants.ERROR_CODE_3, Constants.ERROR_MESSAGE_3);
    }
}
