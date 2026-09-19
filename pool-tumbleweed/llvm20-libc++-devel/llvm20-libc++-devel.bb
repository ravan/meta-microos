SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "llvm20-libc++-devel-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "edd493774a9cb52e1bf792ac620588b3892a207603b3a4b9d1a99fa01d78125303ec314986fdb421cf0723ff4871a21a5f17e4b538e960961ca3aac5b50839ab"

RPROVIDES:${PN} += "libc++.so \
llvm20-libc++-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++1 \
libc++abi.so"

inherit rpm
