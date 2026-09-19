SUMMARY = "Development headers for Boost.Stacktrace library"
DESCRIPTION = "This package contains development headers for Boost.Stacktrace library. \
Boost.Stacktrace is a simple C++03 library that provide information \
about call sequence in a human-readable form. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_stacktrace-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "228fade02bbafdc5a25523c7484bbae87b222148494ac9e185c23a5ebda606675e20573157d0f4f89d4ab23c5ef0a3fe678c6c9f210c5476c3ce7b9f1b50e3f9"

RPROVIDES:${PN} += "libboost-stacktrace-devel"

RDEPENDS:${PN} += "libboost-stacktrace1-91-0-devel"

inherit rpm
