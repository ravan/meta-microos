SUMMARY = "A post-link optimizer developed to speed up large applications"
DESCRIPTION = "BOLT is a post-link optimizer developed to speed up large applications. \
It achieves the improvements by optimizing application's code layout based on \
execution profile gathered by sampling profiler, such as Linux `perf` tool."
LICENSE = "Apache-2.0-with-LLVM-exception"

PV = "22.1.8"

RPM_NAME = "llvm22-bolt-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "0e09900f7853b9df2ed7c73842ed8c1c8f5770a93c440cd3b045ee079e90916f351bb20cb081b772638d72f356ef10fa56cae1b834ae6c6549777cbbf95f7f08"

RPROVIDES:${PN} += "llvm-bolt-provider \
llvm22-bolt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
