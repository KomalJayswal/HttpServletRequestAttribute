package net.learning.HttpServletRequest.Attribute.validator;

import net.learning.HttpServletRequest.Attribute.utils.CommonUtils;
import net.learning.HttpServletRequest.Attribute.utils.Constants;
import org.springframework.stereotype.Component;

@Component
public class MandatoryDataValidator {

    public void validation(String ticketNumber) {

        if (ticketNumber.isEmpty()) {
            CommonUtils.addErrorToList(Constants.ERROR_CODE_1, Constants.ERROR_MESSAGE_1);
        }
    }
}
