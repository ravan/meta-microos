SUMMARY = "Development headers for Boost.Stacktrace library"
DESCRIPTION = "This package contains development headers for Boost.Stacktrace library. \
Boost.Stacktrace is a simple C++03 library that provide information \
about call sequence in a human-readable form."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_stacktrace1_91_0-devel-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "672d5e2e7a0e659c3ff1a994992887d57453616dd235fdda4b93ff339aa4c2c3b91a4c9630686ff2460aa0bbc042c8a637601446e2e40d0b54b13146c9a3aa4f"

RPROVIDES:${PN} += "libboost-stacktrace-devel-impl \
libboost-stacktrace1-91-0-devel"

RDEPENDS:${PN} += "libboost-headers1-91-0-devel \
libboost-stacktrace1-91-0"

inherit rpm
