SUMMARY = "A post-link optimizer developed to speed up large applications"
DESCRIPTION = "BOLT is a post-link optimizer developed to speed up large applications. \
It achieves the improvements by optimizing application's code layout based on \
execution profile gathered by sampling profiler, such as Linux `perf` tool."
LICENSE = "Apache-2.0-with-LLVM-exception"

PV = "23.1.1"

RPM_NAME = "llvm23-bolt-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "383d73e4cb806f180e3ad4fcbf445e0fd51c5a592923222c15b02dfd2c844932f0d53e514eb1c7a0f2eab46518513dd41f3d0edab1cd8384aee3c0b3e65e5d1a"

RPROVIDES:${PN} += "llvm-bolt-provider \
llvm23-bolt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
