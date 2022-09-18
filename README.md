# newsApp
News Application 

NewsApi.org is used to fetch the news data - for using the api an access token is required that must be generated for every user separately on the website Newsapi.org .

Recycler View - used to display the content (news cards) which makes the application much more memory efficient as the cards or view that is scrolled up and away 
                from the view is removed from the memory and when required, is again fetched.
View Pager    - is used to swipe through various fragments(6) such as healtchcare, science, entertainment, etc. each containing news of the respective category.

Fragments     - to store recycler views of different categories and are populated using a Page Adapter

Retro-Fit     - retrofit object is used to make HTTP requests and receive responses. Apache's HTTP client could have been used too but retrofit is a simple to use 
                library that provides lightweight methods to parse JSON data from API to Java friendly format using method GsonConverterFactory method.
                
                
                
--------This is a simple android application which can be improved and developed much more and also has real world usage.
