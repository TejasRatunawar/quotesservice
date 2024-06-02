package com.tejas.myorg.quotesservice.services;

import com.tejas.myorg.quotesservice.models.Quotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotesService {

    @Autowired
    private MongoTemplate mongoTemplate;


    public Quotes createQuote(Quotes quote) {
        return mongoTemplate.save(quote);
    }

    public Quotes getQuote(Long id) {
        return mongoTemplate.findById(id, Quotes.class);
    }

    public Quotes getQuoteByQuoteId(int quoteid) {
        Query query = new Query();
        query.addCriteria(Criteria.where("quoteid").is(quoteid));
        return mongoTemplate.findOne(query, Quotes.class);
    }


    public Quotes updateQuote(Quotes quote) {
        return mongoTemplate.save(quote);
    }

    public void deleteQuote(Long id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.remove(query, Quotes.class);
    }
    public void deleteQuoteByQuoteId(int quoteid) {
        Query query = new Query();
        query.addCriteria(Criteria.where("quoteid").is(quoteid));
        mongoTemplate.remove(query, Quotes.class);
    }

    public List<Quotes> getAllQuotes() {
        return mongoTemplate.findAll(Quotes.class);
    }

    public Quotes getRandomQuote() {
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.sample(1)
        );

        AggregationResults<Quotes> results = mongoTemplate.aggregate(aggregation, "quotes", Quotes.class);
        return results.getUniqueMappedResult();
    }

    public List<Quotes> getQuotesByAuthor(String author) {
        Query query = new Query();
        query.addCriteria(Criteria.where("author").is(author));
        return mongoTemplate.find(query, Quotes.class);
    }


}
