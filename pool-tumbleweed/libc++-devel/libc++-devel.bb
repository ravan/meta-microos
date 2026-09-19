SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "libc++-devel-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "60f191d6c96365e741b756724ceae0a35e7d1426f52b165e873894e81ae68972a8405a0bc7aa9156ae30ce9a65f9343b0a6e9fd2ac49dca10ab6723e45bb72b0"

RPROVIDES:${PN} += "libc++-devel \
libc++.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++1 \
libc++abi.so"

inherit rpm
