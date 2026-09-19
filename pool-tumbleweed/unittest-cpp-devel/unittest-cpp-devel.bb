SUMMARY = "Development files for unittest-cpp"
DESCRIPTION = "A lightweight unit testing framework for C++. \
 \
This package contains header files and libraries needed to develop \
application that use unittest-cpp."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "unittest-cpp-devel-2.0.0-3.5.aarch64.rpm"
RPM_HASH = "4c228a9167b0d1e05a1b00b8d50e4c59e9f7fbaa594c8c76dad5fa97bc2da5b042b1c3e42199ea8800808a52a6208fd7ab3c169fcfd4513afb1353ab3c8d1039"

RPROVIDES:${PN} += "cmake-UnitTest++ \
pkgconfig-UnitTest++ \
unittest-cpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libUnitTest++-2-0-0"

inherit rpm
