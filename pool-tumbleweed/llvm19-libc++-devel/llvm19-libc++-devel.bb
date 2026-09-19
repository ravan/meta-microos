SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "llvm19-libc++-devel-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "5a434c7e3024eac5d7274005803f6c6aa14c04421a80c1894e10e686a738a4e9566958fd78686e4bc567e47920b2c660612ff43e80ee4ca2b046ca3c4f5bdddf"

RPROVIDES:${PN} += "libc++.so \
llvm19-libc++-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++1 \
libc++abi.so"

inherit rpm
