package msuser.ingress.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name=User.TABLE_NAME)
public class User {

    public static final String TABLE_NAME="users";

    @Id
    @NotEmpty(message = "Username cannot be empty")
    @NotNull
    private String username;

    @NotEmpty(message = "FirstName cannot be empty")
    @NotNull
    private String firstName;

    @NotEmpty(message = "LastName cannot be empty")
    @NotNull
    private String lastName;

    @NotEmpty(message = "Email cannot be empty")
    @NotNull
    private String email;

    private String phone;

    private String photo;
}
