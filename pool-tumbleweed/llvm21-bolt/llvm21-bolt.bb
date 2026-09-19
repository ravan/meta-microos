SUMMARY = "A post-link optimizer developed to speed up large applications"
DESCRIPTION = "BOLT is a post-link optimizer developed to speed up large applications. \
It achieves the improvements by optimizing application's code layout based on \
execution profile gathered by sampling profiler, such as Linux `perf` tool."
LICENSE = "Apache-2.0-with-LLVM-exception"

PV = "21.1.8"

RPM_NAME = "llvm21-bolt-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "ce8a44909c79a9b2cb8764a978f9a7ed9cde3056f85430f4c9303cb2d6ba125995ae044b969dbfa783afc8562dfd83a96663d40a292ec0ed2c62cccbfa5e5ac0"

RPROVIDES:${PN} += "llvm-bolt-provider \
llvm21-bolt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.21.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
