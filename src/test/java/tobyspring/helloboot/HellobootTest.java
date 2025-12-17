package tobyspring.helloboot;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@ExtendWith(SpringExtension.class) // spring context 를 이용하도록 도와줌
@ContextConfiguration(classes = HellobootApplication.class) // spring context 구성을 시작할 위치로 HellobootApplication 은 우리가 구성한 모든 빈이 등록되도록 도와줌
@TestPropertySource("classpath:/application.properties")
@Transactional
public @interface HellobootTest {
}
