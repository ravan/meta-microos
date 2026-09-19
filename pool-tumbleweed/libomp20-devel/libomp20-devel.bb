SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "libomp20-devel-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "eafd15de1da787242e428f8aaefbd9fdf81ec88d9678c07e8908756fb4a668b6c4f5c763432aab297ffb79842d394b7f688ee689293c857a6390474a8465ff1c"

RPROVIDES:${PN} += "libarcher.so \
libomp-devel-provider \
libomp.so \
libomp20-devel \
libompd.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
