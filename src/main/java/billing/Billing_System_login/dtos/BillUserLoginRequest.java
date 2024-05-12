package billing.Billing_System_login.dtos;

import jakarta.validation.constraints.Email;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BillUserLoginRequest {
  private Email email;
  private String mobilePhoneNumber;
  private String password;
}
