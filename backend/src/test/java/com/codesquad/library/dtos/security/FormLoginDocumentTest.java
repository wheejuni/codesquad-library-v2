package com.codesquad.library.dtos.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@JsonTest
public class FormLoginDocumentTest {

    private static final Logger log = LoggerFactory.getLogger(FormLoginDocumentTest.class);

    private FormLoginDocument document;

    @Before
    public void setUp() {
        this.document = new FormLoginDocument("fuck@that.shit", "1234");
    }

    @Test
    public void JSONIFY_TEST() throws Exception {
        log.debug(new ObjectMapper().writeValueAsString(this.document));
    }
}
