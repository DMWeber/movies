//
//  ViewController.swift
//  movies
//
//  Created by Denis Weber on 28.06.16.
//  Copyright © 2016 kreait. All rights reserved.
//

import UIKit

class MoviesController: UITableViewController {

    var movies: [Movie]?

    override func viewDidLoad() {
        super.viewDidLoad()

        MovieRepo.getMovies{(error, movies) -> Void in
            if let _ = error {
                print(error.debugDescription)
            } else if let movies = movies where !movies.isEmpty {
                self.movies = movies
                self.tableView?.reloadData()
            }
        }
    }

    override func numberOfSectionsInTableView(tableView: UITableView) -> Int {
        return 1
    }

    override func tableView(tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        if let movies = movies {
            return movies.count
        } else {
            return 0
        }
    }

    override func tableView(tableView: UITableView, cellForRowAtIndexPath indexPath: NSIndexPath) -> UITableViewCell {

        let cell = tableView.dequeueReusableCellWithIdentifier("MovieCell", forIndexPath: indexPath)
        if let movies = movies, cell = cell as? MovieCell {
            let movie = movies[indexPath.row]
            cell.displayMovie(movie);
        }

        return cell
    }
}

