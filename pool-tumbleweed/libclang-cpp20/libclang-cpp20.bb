SUMMARY = "Clang full C++ API"
DESCRIPTION = "This library exposes the full C++ API to Clang that is used to implement \
all Clang tools. It is not stable across major LLVM versions. \
 \
It corresponds to the header files in /usr/include/clang."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "libclang-cpp20-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "b6b5f62145ca7ac4f99d87e1b4b914d13d7fd184ff84403611b580f5b1ce4f65ea5c51d91fa974bcf3b3eb27f998f008cf03b89795a64440d2683332b6cb039d"

RPROVIDES:${PN} += "libclang-cpp.so.20.1 \
libclang-cpp20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.20.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
