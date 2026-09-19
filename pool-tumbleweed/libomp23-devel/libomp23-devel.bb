SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "libomp23-devel-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "46ad7588066a31eb1819e01da2a55bc3ef8d6da878e80162585f7e7a7f83704ecd7dda8212b88a33cfc034e745772d5493c29eb07a6d1205e139650b8565c4ba"

RPROVIDES:${PN} += "libarcher.so \
libomp-devel-provider \
libomp.so \
libomp23-devel \
libompd.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
