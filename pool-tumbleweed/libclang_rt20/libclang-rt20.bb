SUMMARY = "Clang shared runtime libraries"
DESCRIPTION = "The runtime libraries needed to run programs compiled with the -shared-libsan \
of Clang. Also known as compiler-rt."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "libclang_rt20-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "aaea69b8116cd72635ce51a8405e632e5cfb912c5a35dd9ec7baf7d0e78873078260cda181ddfc1e6c58388f0771d552a249e147a1f80818727cc98047226233"

RPROVIDES:${PN} += "libclang-rt.asan-aarch64.so \
libclang-rt.hwasan-aarch64.so \
libclang-rt.scudo-standalone-aarch64.so \
libclang-rt.tsan-aarch64.so \
libclang-rt.ubsan-minimal-aarch64.so \
libclang-rt.ubsan-standalone-aarch64.so \
libclang-rt20"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
