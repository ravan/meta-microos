SUMMARY = "Clang shared runtime libraries"
DESCRIPTION = "The runtime libraries needed to run programs compiled with the -shared-libsan \
of Clang. Also known as compiler-rt."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "libclang_rt18-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "5b2845c5ad302a6197ae6652a54b8ca62a43b1b7fed5dc56adfb7db733f5caac2a1c78dcf6b1d367ab45a89d6d6e884f8d182cf5c67bfeb0394d710e212e0a62"

RPROVIDES:${PN} += "libclang-rt.asan-aarch64.so \
libclang-rt.hwasan-aarch64.so \
libclang-rt.scudo-standalone-aarch64.so \
libclang-rt.tsan-aarch64.so \
libclang-rt.ubsan-minimal-aarch64.so \
libclang-rt.ubsan-standalone-aarch64.so \
libclang-rt18"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
