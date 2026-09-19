SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "llvm18-libc++-devel-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "003cbab06427aa34e244e95d3951fc5c36ade449c61f2d6498c8880e858264f94eb1a6744942863c759578b72679cc70904775a306b3e6f2e9be830548cf46a8"

RPROVIDES:${PN} += "libc++.so \
llvm18-libc++-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++1 \
libc++abi.so"

inherit rpm
