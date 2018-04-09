//
//  ViewController.swift
//  example
//
//  Created by Iain Munro on 05/04/2018.
//  Copyright © 2018 Iain Munro. All rights reserved.
//

import UIKit
import Foundation

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        print(String(cString:hello()))
        
        let license = parseDrivingLicense()
        print( String(cString: license.firstName) )
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

