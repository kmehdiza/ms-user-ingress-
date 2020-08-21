package msuser.ingress.controller;


import lombok.RequiredArgsConstructor;
import msuser.ingress.dto.GetTagDto;
import msuser.ingress.service.TagService;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping
@RestController("/api")
public class TagController {

    private final TagService tagService;

    @GetMapping("/debtor/initial/{applicationId}")
    public void getTag(@PathVariable Long applicationId){
        tagService.getTag(applicationId);
    }
}
