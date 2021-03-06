package com.cs.blog.test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.cs.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 New하는 것은 아니구
//특정 어노테이션이 붙어있는 클래스 파일들을 New해서 IoC 스프링 컨테이너에 넣고 관리해준다.
@RestController 
public class BlogControllerTest {
	
	// http://localhost:8080/test/hello
	@GetMapping("test/hello")
	public String hello() {
		return "<H1>Hello spring boot</H1>";
	}
}
 