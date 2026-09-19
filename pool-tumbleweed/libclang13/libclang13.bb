SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "libclang13-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "fbf30e34de60a1ada15c52fc8fbf3f3f7de889c9d38abfd3461f2cc7e25af8b51f6a59694f16e7c24c212e57bdfc23d76ed9a8a198e16b4e92bece9ae7e54e1f"

RPROVIDES:${PN} += "libclang.so.13 \
libclang13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libc.so.6 \
libclang-cpp.so.23.1 \
libstdc++.so.6"

inherit rpm
