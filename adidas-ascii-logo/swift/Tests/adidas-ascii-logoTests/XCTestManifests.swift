import XCTest

#if !os(macOS)
public func allTests() -> [XCTestCaseEntry] {
    return [
        testCase(adidas_ascii_logoTests.allTests),
    ]
}
#endif