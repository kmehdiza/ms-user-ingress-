package msuser.ingress.controller;


import lombok.RequiredArgsConstructor;
import msuser.ingress.dto.GetTagDto;
import msuser.ingress.service.TagService;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class TagController {

    private final TagService tagService;

    @GetMapping("/debtor/initial/{id}")
    public GetTagDto getTag(@PathVariable Long id){
        System.out.println(id);
        return tagService.getTag(id);
    }
}
