public class parsingAPIResponse {
    
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
		
		//parsingAPIResponse apiParse = new parsingAPIResponse();
		String title = apiParse.parse(response, startRule, endRule); 
	    book.setTitle(title);
	    
	    startRule = "<author>";
	    String name = apiParse.parse(response, startRule, endRule);
	    book.setAuthor(name);
	    
	    startRule = "<image_url>";
	    String imageURL = apiParse.parse(response, startRule, endRule);
	    book.setImageUrl(imageURL);
	    
	    startRule = "<original_publication_year type=\\\"integer\\\">";
	    String pubYear = apiParse.parse(response, startRule, endRule);
	    book.setPublicationYear(new Integer(pubYear));
	    
	    startRule = "<ratings_count type=\\\"integer\\\">";
	    String ratingsCount = apiParse.parse(response, startRule, endRule);
	    book.setRatingsCount(new Integer(ratingsCount.replaceAll(",", "")));
	    
	    startRule = "<average_rating>";
	    String averageRating = apiParse.parse(response, startRule, endRule);
	    book.setAverageRating(new Double(averageRating));
	    
		
		// Your code
		return book;
     }
     
     static private String parse(String response, String startRule, String endRule) {
    	 int pos = response.indexOf(startRule);
    	 int start = pos + startRule.length();
    	 int end = response.indexOf(endRule, start);
    	 
    	 return response.substring(start, end);
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
		
		Book book = parsingAPIResponse.parse(response);
		
		System.out.println(book.getAuthor());
		System.out.println(book.getTitle());
		System.out.println(book.getAverageRating());
		System.out.println(book.getImageUrl());
		System.out.println(book.getPublicationYear());
		System.out.println(book.getRatingsCount());
		
		
	}
}