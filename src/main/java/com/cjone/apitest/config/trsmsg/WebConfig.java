    package com.cjone.apitest.config.trsmsg;

    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;
    import org.springframework.web.servlet.config.annotation.CorsRegistry;
    import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

    @Configuration
    public class WebConfig implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")  // 모든 경로에 대해 CORS 적용
                    .allowedOrigins("http://localhost:3000")  // 허용할 오리진
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // 허용할 HTTP 메서드
                    .allowedHeaders("*")  // 허용할 헤더
                    .allowCredentials(true)  // 쿠키 허용 여부
                    .maxAge(3600);  // 1시간 동안 캐시
        }
    }
