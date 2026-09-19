SUMMARY = "Clang full C++ API"
DESCRIPTION = "This library exposes the full C++ API to Clang that is used to implement \
all Clang tools. It is not stable across major LLVM versions. \
 \
It corresponds to the header files in /usr/include/clang."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "libclang-cpp19-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "23e2d2eece529f5f2f7ad17e3fa46256aa6663ebe0f31f04050cb77c8119e54fde6de79e98d27f1b4083864da7a054d02a7584384c62ab409401c6252cdde56e"

RPROVIDES:${PN} += "libclang-cpp.so.19.1 \
libclang-cpp19"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.19.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
