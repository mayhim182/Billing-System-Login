package billing.Billing_System_login.service;

import billing.Billing_System_login.IService.IBillingUserAuthService;
import billing.Billing_System_login.dtos.BillUserLoginRequest;
import billing.Billing_System_login.dtos.BillUserSignUpRequest;
import org.springframework.stereotype.Service;

@Service
public class BillUserAuthService implements IBillingUserAuthService {

  @Override
  public void signUp(BillUserSignUpRequest billUserSignUpRequest) {

  }

  @Override
  public String login(BillUserLoginRequest billUserLogin) {

    return null;
  }
}
