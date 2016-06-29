//
//  MovieRepo.swift
//  movies
//
//  Created by Denis Weber on 29.06.16.
//  Copyright © 2016 kreait. All rights reserved.
//

import Foundation
import Alamofire
import AlamofireObjectMapper
import ObjectMapper

class MovieRepo {

    static let baseUrl = "http://localhost:8080"

    class func getMovies(completion: (error: ErrorType?, movies: [Movie]?) -> Void) {

        let url = baseUrl + "/movies"
        Alamofire.request(.GET, url).validate(statusCode: 200..<300).responseArray { (response: Response<[Movie], NSError>) in

            let movies = response.result.value
            print(movies)
            completion(error: response.result.error, movies: movies)
        }
    }
}