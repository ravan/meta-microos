SUMMARY = "Clang full C++ API"
DESCRIPTION = "This library exposes the full C++ API to Clang that is used to implement \
all Clang tools. It is not stable across major LLVM versions. \
 \
It corresponds to the header files in /usr/include/clang."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "libclang-cpp21-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "521a56969819800b6e7cd26c8a9cae29c77a0a08b13a0ce366e40fc17504525cfd026a3c0bc5fca67aea8fda1feea15872c9ab884354272ae20078bfd8b68d40"

RPROVIDES:${PN} += "libclang-cpp.so.21.1 \
libclang-cpp21"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.21.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
