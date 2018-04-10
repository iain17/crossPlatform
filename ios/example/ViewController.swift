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
        
        //Encode
        let size = 128
        let buffer = UnsafeMutablePointer<UInt8>.allocate(capacity: size)
        testEncode(buffer, size)
        var data = Data(bytesNoCopy: buffer, count: size, deallocator: .none)
        print(data.hexEncodedString())
        
        //Decode
        var rect = UnsafeMutablePointer<Rectangle_t>.allocate(capacity: 1)
        let success = testDecode(rect, buffer, size);
        let abc = rect.move()
        print(success)
        print(abc)
        
        buffer.deallocate()
        rect.deallocate()
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    
}

extension Data {
    struct HexEncodingOptions: OptionSet {
        let rawValue: Int
        static let upperCase = HexEncodingOptions(rawValue: 1 << 0)
    }
    
    func hexEncodedString(options: HexEncodingOptions = []) -> String {
        let format = options.contains(.upperCase) ? "%02hhX" : "%02hhx"
        return map { String(format: format, $0) }.joined()
    }
}

