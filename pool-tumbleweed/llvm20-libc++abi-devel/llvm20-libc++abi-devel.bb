SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "llvm20-libc++abi-devel-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "c7109dd4c2aec05a576a69ad66fb08d2340355a8ce9add623c04c7ffbd0ec8033cbaabb49935845ecd0ac3a58fe51d777dfe793c49e440a6385c0b76e3d1996a"

RPROVIDES:${PN} += "libc++abi.so \
llvm20-libc++abi-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++abi1"

inherit rpm
