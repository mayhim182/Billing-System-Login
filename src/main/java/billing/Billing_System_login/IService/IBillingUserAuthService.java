package billing.Billing_System_login.IService;

import billing.Billing_System_login.dtos.BillUserLoginRequest;
import billing.Billing_System_login.dtos.BillUserSignUpRequest;

public interface IBillingUserAuthService {
  public void signUp(BillUserSignUpRequest billUserSignUpRequest);

  public String login(BillUserLoginRequest billUserLogin);
}
