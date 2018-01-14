package service;

import com.tseong.gecmvc.model.Account;
import com.tseong.gecmvc.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value="file:/web")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath:spring/applicationContext.xml"),
        @ContextConfiguration(name = "child", locations = "classpath:spring/dispatcher-servlet.xml")
})
public class AccountServiceImplTest {

    @Autowired
    private IAccountService accountService;

    @Test
    public void getAccount() {
        Account acc = accountService.getAccountById(2);
        System.out.println(acc.getAccountName());
    }
}
