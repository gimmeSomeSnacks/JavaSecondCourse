package ru.tuganov.services;

import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import ru.tuganov.entities.Subject;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class CustomEmailSender{
    private final JavaMailSender javaMailSender;

    @Async
    public void sendEmail(Subject subject) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom("nikita.tuganoff@gmail.com");
        mailMessage.setTo("n-tuganov@mail.ru");
        mailMessage.setSubject("Добавлено что-то");
        mailMessage.setText("Добавлено: " + subject.toString());
        javaMailSender.send(mailMessage);
    }
}
