# CrossPlatform
> This repo is a quick proof of concept where code written in C++ is shared between a native iOS and Android application. Written in Swift and Java.

[![License][license-image]][license-url]
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)

The app launches and will try and call both a simple hello function that returns a string and a function that returns a struct. Note how the C++ code doesn't have to be adjusted in order for it to work in Java or Swift.

## Technologies used

- [JNA](https://github.com/java-native-access/jna) in combination with [NDK](https://developer.android.com/ndk/index.html) - See [examples](https://www.eshayne.com/jnaex/index.html)
- Swift

## Requirements

- iOS 8.0+
- Xcode 7.3
- Android Studio

## Installation
Open both the Android Studio project and iOS project and run it. As simple as that.

## Contribute

Please fork this project and do with it as you wish.

## Meta

Iain Munro – [@iain1711](https://twitter.com/iain1711) – iain@imunro.nl.

Distributed under the MIT license. See ``LICENSE`` for more information.