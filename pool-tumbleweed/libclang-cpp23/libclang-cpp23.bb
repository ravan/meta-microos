SUMMARY = "Clang full C++ API"
DESCRIPTION = "This library exposes the full C++ API to Clang that is used to implement \
all Clang tools. It is not stable across major LLVM versions. \
 \
It corresponds to the header files in /usr/include/clang."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "libclang-cpp23-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "c645c061fc89f638c091060b831fe9d1d57f7c946cef4d7e72aecc1576b77b6615955bd27fa30826b0a11f273eab7ccbcff45a969ece1e5996a13a10d525b176"

RPROVIDES:${PN} += "libclang-cpp.so.23.1 \
libclang-cpp23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
