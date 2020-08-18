package msuser.ingress.service;

import msuser.ingress.dto.PageDto;
import msuser.ingress.model.Tag;
import org.springframework.data.domain.Page;

public interface TagService {

    Tag findById(Long id);

    Tag add(Tag tag);

    Tag updateTag(Tag tag, Tag updatedTag);

    void deleteById(Long id);

    Page<Tag> list(PageDto page);
}
