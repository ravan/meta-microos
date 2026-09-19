SUMMARY = "C-based SPMD programming language compiler"
DESCRIPTION = "A compiler for a variant of the C programming language, with extensions for \
'single program, multiple data' (SPMD) programming."
LICENSE = "BSD-3-Clause"

PV = "1.31.0"

RPM_NAME = "ispc-1.31.0-2.3.aarch64.rpm"
RPM_HASH = "501539340e02836dc595196b2659d327e41f8ac01bca2f0888963aa2861fa99378a89c319b31b83b9ebc3658be0a2800b894d0e947ed877e83bfaa2e92bd5921"

RPROVIDES:${PN} += "ispc"

RDEPENDS:${PN} += "ispc-devel \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libclang-cpp.so.22.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
