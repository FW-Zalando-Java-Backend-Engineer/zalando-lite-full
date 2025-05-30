package com.zalando.lite;

import java.util.List;
import java.util.Map;

/**
 * Manages customer reviews in the ZalandoLite system.
 *
 * This class is responsible for:
 * - Adding new reviews to a product
 * - Retrieving all reviews for a given product
 *
 * Internally, it uses a map where each key is a product ID, and the value is
 * a list of reviews associated with that product.
 *
 * This design allows fast lookup and supports multiple reviews per product.
 *
 * Concepts reinforced:
 * - Nested collections (`Map<Integer, List<Review>>`)
 * - Data retrieval patterns
 * - Collection initialization and null checks
 */
public class ReviewManager {

    // Stores reviews by product ID
    private Map<Integer, List<Review>> reviewMap;

    /**
     * Adds a review to the map, linked by the product's ID.
     * Initializes a new list if it's the first review for the product.
     *
     * @param review the review to add
     */
    public void addReview(Review review) {
        // TODO: Get product ID from review
        // TODO: Check if review list exists for this product
        // TODO: If not, create a new list
        // TODO: Add review to the list
    }

    /**
     * Retrieves all reviews for a specific product by ID.
     *
     * @param productId the ID of the product to look up
     * @return list of reviews or empty list if none exist
     */
    public List<Review> getReviewsForProduct(int productId) {
        // TODO: Return the list from the map
        // TODO: If no reviews exist, return an empty list instead of null
        return null;
    }

    /**
     * Optional: Print all reviews in a formatted way for CLI.
     * Useful for menus or reports.
     */
    public void printReviewsForProduct(int productId) {
        // TODO: Get and print each review from the list
    }
}
