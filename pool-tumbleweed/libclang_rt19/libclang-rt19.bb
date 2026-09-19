SUMMARY = "Clang shared runtime libraries"
DESCRIPTION = "The runtime libraries needed to run programs compiled with the -shared-libsan \
of Clang. Also known as compiler-rt."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "libclang_rt19-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "60a4344ba197ae246dbdd3b51ad172b81042c3c2490510cb3169d14847e432ae6476cb63fa56c137a08369adb7c3d24d066795bfba91660854f9f6b7c360487d"

RPROVIDES:${PN} += "libclang-rt.asan-aarch64.so \
libclang-rt.hwasan-aarch64.so \
libclang-rt.scudo-standalone-aarch64.so \
libclang-rt.tsan-aarch64.so \
libclang-rt.ubsan-minimal-aarch64.so \
libclang-rt.ubsan-standalone-aarch64.so \
libclang-rt19"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
