# The Simpsons Pool

An Android application that displays characters from the popular TV show "The Simpsons" using the
free [Simpson API](https://thesimpsonsapi.com).

## Features

- Browse Simpsons characters.
- View character details.
- Browse Simpsons episodes.
- View episodes details.
- Browse Simpsons locations.
- View locations details.

## API Information

This app uses [Simpson API](https://thesimpsonsapi.com) to fetch character, episodes and locations.

**API Endpoints:**

- Base Url - `https://thesimpsonsapi.com/api`
- Characters - `https://thesimpsonsapi.com/api/characters`
- Characters by Id - `https://thesimpsonsapi.com/api/characters/:id`
- Episodes - `https://thesimpsonsapi.com/api/episodes`
- Episodes by Id - `https://thesimpsonsapi.com/api/episodes/:id`
- Locations - `https://thesimpsonsapi.com/api/locations`
- Locations by Id - `https://thesimpsonsapi.com/api/locations/:id`

**CDN Images:**

- Image URL Pattern - `https://cdn.thesimpsonsapi.com/{size}{image_path}`
- Available Sizes:
    - 200px.
    - 500px.
    - 1280px.
- Examples:
    - https://cdn.thesimpsonsapi.com/200/episode/1.webp
    - https://cdn.thesimpsonsapi.com/500/character/1.webp
    - https://cdn.thesimpsonsapi.com/1280/location/1.webp

🖼️ Image Best Practices recommended by API's authors

- Choose the smallest size that meets your design requirements
- Implement lazy loading for better page performance
- Add appropriate alt text for accessibility

## Installation & Usage

1. Clone this repository
2. Open the project in Android Studio
3. Build and run the application

## 🔗 API Used

[Simpson API](https://thesimpsonsapi.com)  
[Github Project](https://github.com/Facug03/the-simpsons-api) - MIT License

## License

This project is licensed under the MIT Licence.  
See the [LICENSE](LICENSE) file for more details.  
See the [NOTICE](NOTICE) file for copyright information.  

--- 

*Just a personal project.*
