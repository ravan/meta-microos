SUMMARY = "Clang full C++ API"
DESCRIPTION = "This library exposes the full C++ API to Clang that is used to implement \
all Clang tools. It is not stable across major LLVM versions. \
 \
It corresponds to the header files in /usr/include/clang."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "libclang-cpp22-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "482c3050c3b3c4f70aaf54a775fc1ceee6574a138733036bbeb5c7bb207fb76f644367835cdf9293703d2a545f0d75ae81418b5b67e3848d67bd556a38f0054a"

RPROVIDES:${PN} += "libclang-cpp.so.22.1 \
libclang-cpp22"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
