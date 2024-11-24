package gastro.coreService.controller;

import gastro.coreService.service.CoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class CoreController {
    private final CoreService coreService;

    public CoreController(CoreService coreService) {
        this.coreService = coreService;
    }
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok(coreService.helloWorld());
    }
}
