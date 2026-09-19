SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "llvm21-libc++-devel-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "c213040959ce58aff84e92695c35624212571497e59cf9b5904cb13e03fdcc79b78f05cbf61c1c73a0cc0478a5062a8d726fe1d787f01cd00efc81fd4f7294fc"

RPROVIDES:${PN} += "libc++.so \
llvm21-libc++-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++1 \
libc++abi.so"

inherit rpm
