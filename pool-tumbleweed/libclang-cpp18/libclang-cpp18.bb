SUMMARY = "Clang full C++ API"
DESCRIPTION = "This library exposes the full C++ API to Clang that is used to implement \
all Clang tools. It is not stable across major LLVM versions. \
 \
It corresponds to the header files in /usr/include/clang."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "libclang-cpp18-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "82f73f1a84efeb264e0a212038c87930ee10ed3ada7d96f2715c8ed7245f5bd250d7e648095663d34eaafa1186c541ab975d9c9641599976638301dabe1538fc"

RPROVIDES:${PN} += "libclang-cpp.so.18.1 \
libclang-cpp18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.18.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
