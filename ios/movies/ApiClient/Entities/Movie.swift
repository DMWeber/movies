//
//  Movie.swift
//  movies
//
//  Created by Denis Weber on 29.06.16.
//  Copyright © 2016 kreait. All rights reserved.
//

import Foundation
import ObjectMapper

class Movie: Mappable {

    var id:Int?
    var title:String?

    required init?(_ map: Map){

    }

    func mapping(map: Map) {
        id <- map["id"]
        title <- map["title"]
    }

}