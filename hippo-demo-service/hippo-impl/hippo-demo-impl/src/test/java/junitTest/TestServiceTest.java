package junitTest;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.hippo.annotation.HippoClient;
import com.github.hippo.demo.dto.TestRequest;
import com.github.hippo.demo.dto.TestResponse;
import com.github.hippo.demo.service.TestService;


@ContextConfiguration(locations = "classpath:/application-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestServiceTest {

  @HippoClient
  private TestService testService;

  @Test
  public void test() throws Exception {
    TestRequest request = new TestRequest();
    request.setId(1);
    request.setMsg("test");
    TestResponse response = testService.test(request);
    System.out.println(">>>>>>" + ToStringBuilder.reflectionToString(response));
  }

  @Test
  public void getUserName() throws Exception {
    String usrname = testService.getUserName("12345");
    System.out.println(usrname);
  }
}
