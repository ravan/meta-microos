SUMMARY = "Clang shared runtime libraries"
DESCRIPTION = "The runtime libraries needed to run programs compiled with the -shared-libsan \
of Clang. Also known as compiler-rt."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "libclang_rt23-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "94447a942b56a837e3ff496a360564f865f2a88656e4ddcdb2d679c0d35e7b79f625d2f30269170cfc792c07daae9fbc16b05830781995ceda23fc34dd908dd9"

RPROVIDES:${PN} += "libclang-rt.asan-aarch64.so \
libclang-rt.hwasan-aarch64.so \
libclang-rt.scudo-standalone-aarch64.so \
libclang-rt.tsan-aarch64.so \
libclang-rt.ubsan-minimal-aarch64.so \
libclang-rt.ubsan-standalone-aarch64.so \
libclang-rt23"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
