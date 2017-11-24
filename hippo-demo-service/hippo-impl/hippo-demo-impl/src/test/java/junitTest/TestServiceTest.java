package junitTest;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.hippo.annotation.HippoClient;
import com.github.hippo.callback.CallTypeHelper;
import com.github.hippo.callback.ICallBack;
import com.github.hippo.client.HippoProxy;
import com.github.hippo.demo.dto.TestRequest;
import com.github.hippo.demo.dto.TestResponse;
import com.github.hippo.demo.service.TestService;


@ContextConfiguration(locations = "classpath:/application-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestServiceTest {
  
  @HippoClient
  private TestService testService;
  
  @Test
  public void ping() throws Exception {
    testService.ping("sl");
  }

  

  @Autowired
  private HippoProxy hippoProxy;

  @Test
  public void test() throws Exception {



    TestRequest request = new TestRequest();
    request.setId(1);
    request.setMsg("test");
    TestResponse response = testService.test(request);
    System.out.println(">>123>>>>>" + ToStringBuilder.reflectionToString(response));
    TestRequest request2 = new TestRequest();
    CallTypeHelper.SETTING.async(new ICallBack() {

      @Override
      public void onSuccess(Object result) {
        System.out.println(">>45622222222>>>>>" + ToStringBuilder.reflectionToString(result));

      }

      @Override
      public void onFailure(Throwable e) {
        e.printStackTrace();

      }
    });
    request2.setId(1);
    request2.setMsg("123123123test");
    TestResponse response2 = testService.test(request2);
    System.out.println(">>456>>>>>" + ToStringBuilder.reflectionToString(response2));

    TestRequest request3 = new TestRequest();
    request3.setId(1);
    request3.setMsg("test");
    CallTypeHelper.SETTING.oneway();
    TestResponse response3 = testService.test(request3);
    System.out.println(">>123>>>>>" + ToStringBuilder.reflectionToString(response3));

    Thread.sleep(1000 * 1000);
  }

  @Test
  public void getUserName() throws Exception {
    InputStream in = new ByteArrayInputStream("12345".getBytes());
    testService.getUserName(in);
  }

 

  @Test
  public void ping1() throws Throwable {
    System.out.println(hippoProxy.apiRequest("hippo.demo.service", "TestService/ping1",
        "{\"username\":\"598fdc0b0cf29eb2a0928a6d\",\"test\":[1,2,3]}"));
  }

  @Test
  public void ping2() throws Throwable {
    System.out.println(hippoProxy.apiRequest("hippo.demo.service", "TestService/ping2",
        "{\"uname\":\"598fdc0b0cf29eb2a0928a6d\",\"list\":[1,2,3]}"));
  }

}
