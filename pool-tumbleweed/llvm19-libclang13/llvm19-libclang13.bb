SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "llvm19-libclang13-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "8eed2e26bb010fc7b088a6951fe6b043065bef37544a660f5849bee464acec3aae423ed32eae72523ba76ca66c2fd40fe0558f0653583cc1885deccb4b995c37"

RPROVIDES:${PN} += "libclang.so.13 \
libclang13 \
llvm19-libclang13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.19.1 \
libc.so.6 \
libclang-cpp.so.19.1 \
libstdc++.so.6"

inherit rpm
