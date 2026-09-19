SUMMARY = "Headers for embedding Janet scripting"
DESCRIPTION = "Janet is a functional and imperative programming language.  Janet scripting \
can be added to an application by embedding a single C source file and a \
single header. \
 \
This package contains the development files for the Janet programming language. \
It contains static libraries for -static linking which is highly discouraged."
LICENSE = "MIT"

PV = "1.39.0"

RPM_NAME = "janet-devel-static-1.39.0-1.6.aarch64.rpm"
RPM_HASH = "46ff16970f17d0997ef3524ef18598d04d946865460a5bca219113698d31070a0b9cfcd6fff263aa0f4010ecb349d2d3f60e9c6cf1aa6942f448536e196cb4d6"

RPROVIDES:${PN} += "janet-devel-static"

RDEPENDS:${PN} += "janet-devel \
libjanet1-39"

inherit rpm
