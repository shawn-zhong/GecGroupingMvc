package com.tseong.gecmvc.web;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value="file:/web")
@ContextHierarchy({
        @ContextConfiguration(name = "parent", locations = "classpath:spring/applicationContext.xml"),
        @ContextConfiguration(name = "child", locations = "classpath:spring/dispatcher-servlet.xml")
})
public class DemoLoginTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }


    @Test
    public void testGetAllUsers() throws Exception {
        MvcResult result = mockMvc.perform(get("/users/all"))
        //        .andExpect(MockMvcResultMatchers.model().attributeExists("name"))
        //        .andExpect(view().name("users/all"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();

        //  Assert.assertNotNull(result.getModelAndView().getModel().
    }

    @Test
    public void testGetUserByName() throws Exception {
        MvcResult result = mockMvc.perform(get("/users/name/shawn"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void testPost() throws Exception {
        MvcResult result = mockMvc.perform(post("/users/add").param("accountName", "newherer").param("accountPwd", "dd"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

}
