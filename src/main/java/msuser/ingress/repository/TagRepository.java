package msuser.ingress.repository;

import msuser.ingress.model.Tag;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TagRepository extends PagingAndSortingRepository<Tag,Long> {

}
