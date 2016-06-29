//
//  ViewController.swift
//  movies
//
//  Created by Denis Weber on 28.06.16.
//  Copyright © 2016 kreait. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()



        MovieRepo.getMovies{(error, movies) -> Void in
            if let _ = error {
                print(error.debugDescription)
            } else if let movies = movies where !movies.isEmpty {
                // show movies
            }
        }
    }
    
}

