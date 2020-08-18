package msuser.ingress.service.impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import msuser.ingress.dto.PageDto;
import msuser.ingress.exception.AlreadyExistException;
import msuser.ingress.exception.NotFoundException;
import msuser.ingress.model.Tag;
import msuser.ingress.repository.TagRepository;
import msuser.ingress.service.TagService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.rmi.AlreadyBoundException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    @Override
    public Tag findById(Long id) {
        return tagRepository.findById(id).orElseThrow(()->new NotFoundException("Tag id:"+id));
    }

    @Override
    public Tag add(Tag tag) {
       Optional<Tag> tagRes = checkIfTagExist(tag.getId());
       if (tagRes.isPresent()){
           throw new AlreadyExistException("Tag with this id already exist: "+tag.getId());
       }else {
           Tag createTag = Tag.builder()
                   .name(tag.getName()).build();
           tagRepository.save(createTag);
       }
       return null;
    }

    @Override
    public Tag updateTag(Tag tag, Tag updatedTag) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Page<Tag> list(PageDto page) {
        return null;
    }

    private Optional<Tag> checkIfTagExist(Long id){
        return tagRepository.findById(id);
    }
}
