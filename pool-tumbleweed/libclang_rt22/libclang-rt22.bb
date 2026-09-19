SUMMARY = "Clang shared runtime libraries"
DESCRIPTION = "The runtime libraries needed to run programs compiled with the -shared-libsan \
of Clang. Also known as compiler-rt."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "libclang_rt22-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "fa61a64f51ae8d44d0b8e86ad28b40af9f958dc0195c3f600b80b203d677fab4938a0ab9d0da4c3ab179b62a99325055e3d5c97a79c6631575aa19e001ce454d"

RPROVIDES:${PN} += "libclang-rt.asan-aarch64.so \
libclang-rt.hwasan-aarch64.so \
libclang-rt.scudo-standalone-aarch64.so \
libclang-rt.tsan-aarch64.so \
libclang-rt.ubsan-minimal-aarch64.so \
libclang-rt.ubsan-standalone-aarch64.so \
libclang-rt22"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
