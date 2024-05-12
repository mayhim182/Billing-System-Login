package billing.Billing_System_login.controllers;

import billing.Billing_System_login.IService.IBillingUserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class BillingAuthController {
  @Autowired
  public IBillingUserAuthService billingUserAuthService;


}
