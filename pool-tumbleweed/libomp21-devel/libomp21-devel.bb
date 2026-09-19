SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "libomp21-devel-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "1c48f56e4206fa36c47e6f8af67aefa82b46049bc8660b1701d430d51b60f99d3e6fd72a321e9a34355cfc5f6c5655cc2c7f96652c36202cd20d1a742ab36107"

RPROVIDES:${PN} += "libarcher.so \
libomp-devel-provider \
libomp.so \
libomp21-devel \
libompd.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
