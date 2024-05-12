package billing.Billing_System_login.models;

import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "billuser")
@Builder
public class BillUserDetails {
  @Id
  private String id;
  private Email email;
  private String mobilePhoneNumber;
  private String businessName;
  private String ownerName;
  private String password;
}
