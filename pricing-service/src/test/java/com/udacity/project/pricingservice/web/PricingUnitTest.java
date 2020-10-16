package com.udacity.project.pricingservice.web;

import com.udacity.project.pricingservice.entity.Price;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SpringRunner.class)
public class PricingUnitTest {
    private TestRestTemplate restTemplate;

    @Before
    public void init() {
        restTemplate = new TestRestTemplate();
    }

    @Test
    public void getAllPricing() throws Exception {
        ResponseEntity<Price> responseEntity = restTemplate.getForEntity("http://localhost:8762/prices", Price.class);
        assertThat(responseEntity.getStatusCode(), equalTo(HttpStatus.OK));
    }
}
