package msuser.ingress.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PageDto {

    private int pageNumber;

    private int pageSize;

    private String sortColumn;

    private String sortDirection;
}
