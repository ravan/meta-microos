SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "libomp19-devel-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "fbc607424b6c3ec39f4e1249bc3bb8d06e1a545eef4ee6b3cc247feea4792a181d6b263a11626dfd59e1a8d30f1030bc4496217d85f10c30d16e653d7737f4db"

RPROVIDES:${PN} += "libarcher.so \
libomp-devel-provider \
libomp.so \
libomp19-devel \
libompd.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
