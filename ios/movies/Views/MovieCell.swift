//
//  MovieCell.swift
//  movies
//
//  Created by Denis Weber on 29.06.16.
//  Copyright © 2016 kreait. All rights reserved.
//

import Foundation
import UIKit

class MovieCell: UITableViewCell {
    
    @IBOutlet
    var movieImage: UIImageView?

    @IBOutlet
    var movieTitle: UILabel?



    func displayMovie(movie: Movie?) {
        if let movie = movie {
            self.movieTitle?.text = movie.title;
        }
    }
}
