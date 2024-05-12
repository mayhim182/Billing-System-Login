package billing.Billing_System_login.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BillUserSignUpRequest {
  @NotBlank
  @Size(max = 50)
  @Email
  private Email email;
  @NotBlank
  private String mobilePhoneNumber;
  @NotBlank
  private String businessName;
  @NotBlank
  private String ownerName;
  @NotBlank
  private String password;
}
