package net.learning.HttpServletRequest.Attribute.service;

import net.learning.HttpServletRequest.Attribute.utils.CommonUtils;
import net.learning.HttpServletRequest.Attribute.utils.Constants;
import net.learning.HttpServletRequest.Attribute.validator.MandatoryDataValidator;
import net.learning.HttpServletRequest.Attribute.validator.TicketValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
    @Autowired
    private MandatoryDataValidator mandatoryDataValidator;

    @Autowired
    private TicketValidator ticketValidator;

    public String conditionalCheck(String ticketNumber){

        mandatoryDataValidator.validation(ticketNumber);
        ticketValidator.validation(ticketNumber);

        CommonUtils.validateErrors();

        return Constants.SUCCESS+ticketNumber;
    }
}
