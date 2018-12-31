package com.scorpios.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootTaskApplicationTests {

    @Autowired
    JavaMailSenderImpl javaMailSender;


    @Test
    public void contextLoads() {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setSubject("放假通知");
        simpleMailMessage.setText("下周放假");
        simpleMailMessage.setTo("zhangxd6@asiainfo-sec.com");
        simpleMailMessage.setFrom("1435513775@qq.com");

        javaMailSender.send(simpleMailMessage);

    }

    @Test
    public void test02() throws MessagingException {

        MimeMessage mimeMailMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMailMessage, true);


        helper.setSubject("通知-放假通知");
        helper.setText("<b style='color:red'>下周放假</b>", true);
        helper.setTo("zhangxd6@asiainfo-sec.com");
        helper.setFrom("1435513775@qq.com");

        helper.addAttachment("1.jpg", new File("C:\\Users\\Think\\Downloads\\scorpios.group_cert.jpg"));
        helper.addAttachment("2.jpg", new File("C:\\Users\\Think\\Downloads\\scorpios.xin_cert.jpg"));

        javaMailSender.send(mimeMailMessage);

    }

}

