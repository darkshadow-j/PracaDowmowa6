package pl.pawel.workaspect.api.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pawel.workaspect.mail.MailService;

@Aspect
@Component
public class AcpectFilm {
    MailService mailService;

    @Autowired
    public AcpectFilm(MailService mailService) {
        this.mailService = mailService;
    }

    @After("@annotation(AddFilm)")
    public void SendMail(){
        mailService.sendEmail();
    }

}
