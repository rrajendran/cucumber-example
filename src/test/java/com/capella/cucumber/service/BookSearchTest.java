package com.capella.cucumber.service;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by asylum on 4/11/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:feature/book/search_book.feature"})
public class BookSearchTest {
    @Test
    public void testFindBooks() throws Exception {
    }
}