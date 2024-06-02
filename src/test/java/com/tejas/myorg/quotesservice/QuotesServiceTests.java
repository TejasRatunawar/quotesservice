/*
package com.tejas.myorg.quotesservice;

import com.tejas.myorg.quotesservice.models.Quotes;
import com.tejas.myorg.quotesservice.services.QuotesService;
import org.bson.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Query;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class QuotesServiceTests {

    @Mock
    private MongoTemplate mongoTemplate;

    @InjectMocks
    private QuotesService quotesService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createQuoteSuccessfully() {
        Quotes quote = new Quotes();
        when(mongoTemplate.save(quote)).thenReturn(quote);

        Quotes result = quotesService.createQuote(quote);

        assertEquals(quote, result);
        verify(mongoTemplate, times(1)).save(quote);
    }

    @Test
    void getQuoteSuccessfully() {
        Quotes quote = new Quotes();
        when(mongoTemplate.findById(123l, Quotes.class)).thenReturn(quote);

        Quotes result = quotesService.getQuote(123l);

        assertEquals(quote, result);
        verify(mongoTemplate, times(1)).findById(123l, Quotes.class);
    }

    @Test
    void updateQuoteSuccessfully() {
        Quotes quote = new Quotes();
        when(mongoTemplate.save(quote)).thenReturn(quote);

        Quotes result = quotesService.updateQuote(quote);

        assertEquals(quote, result);
        verify(mongoTemplate, times(1)).save(quote);
    }

//    @Test
//    void deleteQuoteSuccessfully() {
//        doNothing().when(mongoTemplate).remove(any(Query.class), eq(Quotes.class));
//
//        quotesService.deleteQuote(123l);
//
//        verify(mongoTemplate, times(1)).remove(any(Query.class), eq(Quotes.class));
//    }

    @Test
    void getAllQuotesSuccessfully() {
        List<Quotes> quotes = Arrays.asList(new Quotes(), new Quotes());
        when(mongoTemplate.findAll(Quotes.class)).thenReturn(quotes);

        List<Quotes> result = quotesService.getAllQuotes();

        assertEquals(quotes, result);
        verify(mongoTemplate, times(1)).findAll(Quotes.class);
    }

    @Test
    void getRandomQuoteSuccessfully() {
        Quotes quote = new Quotes();
        when(mongoTemplate.aggregate(any(Aggregation.class), eq("quotes"), eq(Quotes.class)))
                .thenReturn(new AggregationResults<>(Arrays.asList(quote), new Document()));

        Quotes result = quotesService.getRandomQuote();

        assertEquals(quote, result);
        verify(mongoTemplate, times(1)).aggregate(any(Aggregation.class), eq("quotes"), eq(Quotes.class));
    }
}
*/
