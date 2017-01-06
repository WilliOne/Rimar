package labs;

    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    public class RegController {

        @RequestMapping("/login")
        public String log() {
            return "log";
            	
        }
        
        @RequestMapping("/registration")
        public String reg() {
            return "reg";
            	
        }
        
        @RequestMapping("/home")
        public String home() {
            return "home";
            	
        }
    }