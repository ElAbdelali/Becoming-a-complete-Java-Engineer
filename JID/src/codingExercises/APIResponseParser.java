package codingExercises;

public class APIResponseParser {
    
     /**
	 * Parses the input text and returns a Book instance containing
	 * the parsed data. 
	 * @param response text to be parsed
	 * @return Book instance containing parsed data
	 */
     public static Book parse(String response) {
        Book book = new Book();
		String endRule = "<";
		
		String startRule = "<title>";		
		String title = parse(response, startRule, endRule); 
	    book.setTitle(title);
		
	    
		String startRule2 = "<name>";
		String authorName = parse(response, startRule2, endRule);
		book.setAuthor(authorName);
		
		String startRule3 = "<original_publication_year type=\"integer\">";
		Integer pubYear = Integer.parseInt(parse(response, startRule3, endRule));
		book.setPublicationYear(pubYear);
		
		String startRule4 = "<average_rating>";
		Double avgRating = Double.parseDouble(parse(response, startRule4, endRule));
		book.setAverageRating(avgRating);
		
		String startRule5 = "<ratings_count type=\"integer\">";
		Integer ratingsCount = Integer.parseInt(parse(response, startRule5, endRule));
		book.setRatingsCount(ratingsCount);
		
		String startRule6 = "<image_url>";
		String imageUrl = parse(response, startRule6, endRule);
		book.setImageUrl(imageUrl);
		
		return book;
     }
     
     private static String parse(String response, String startRule, String endRule) {
    	int startPosition = response.indexOf(startRule) + startRule.length();
    	int endPosition = response.indexOf(endRule, startPosition);
    	String result = response.substring(startPosition, endPosition);
    	
    	if (result.contains(",")) {
    		result = result.replace(",", "");
    	}
    	return result;
     }
     public static void main(String[] args) {
		String response = "<work>" + 
	                            "<id type=\"integer\">2361393</id>" +
	                            "<books_count type=\"integer\">813</books_count>" +
	                            "<ratings_count type=\"integer\">1,16,315</ratings_count>" + 
	                            "<text_reviews_count type=\"integer\">3439</text_reviews_count>" +
	                            "<original_publication_year type=\"integer\">1854</original_publication_year>" +
								"<original_publication_month type=\"integer\" nil=\"true\"/>" +
								"<original_publication_day type=\"integer\" nil=\"true\"/>" +
								"<average_rating>3.79</average_rating>" +
								"<best_book type=\"Book\">" +
									"<id type=\"integer\">16902</id>" +
									"<title>Walden</title>" + 
									"<author>" +
										"<id type=\"integer\">10264</id>" + 
										"<name>Henry David Thoreau</name>" + 
									"</author>" +
									"<image_url>" + 
										"http://images.gr-assets.com/books/1465675526m/16902.jpg" +
									"</image_url>" +
									"<small_image_url>" + 
										"http://images.gr-assets.com/books/1465675526s/16902.jpg" +
									"</small_image_url>" +
								"</best_book>" +
							"</work>";
		APIResponseParser.parse(response);
	}
}