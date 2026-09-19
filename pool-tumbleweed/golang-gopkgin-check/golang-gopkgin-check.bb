SUMMARY = "Rich testing framework for the Go language"
DESCRIPTION = "The Go language provides an internal testing library, named 'testing', which is \
relatively slim due to the fact that the standard library correctness by itself \
is verified using it. The gocheck package, on the other hand, expects the \
standard library from Go to be working correctly, and builds on it to offer a \
richer testing framework for libraries and applications to use."
LICENSE = "BSD-3-Clause"

PV = "0.0.0+git20161122.aa8c435"

RPM_NAME = "golang-gopkgin-check-0.0.0+git20161122.aa8c435-1.28.aarch64.rpm"
RPM_HASH = "d205528429bcf045d2c904c973545c7915054c5717fe47dd4970ce72ec88df1ccd6f2f11390040f045bf5d606c28b0cea16440ffa8f3efe95d46cb5d5f8595b5"

RPROVIDES:${PN} += "golang-gopkgin-check"

RDEPENDS:${PN} += ""

inherit rpm
