SUMMARY = "MPI plugin for LLVM"
DESCRIPTION = "This package contains the OpenMP MPI plugin for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "libomp22-devel-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "83984b54ed332e15655a3976d31ca2031646600ad1b6bedad5abc5dc56a284aad14063cc4dfe78112f0e778bc100f454a7074ea5fce3d2c08fc77d4dd85e9f38"

RPROVIDES:${PN} += "libarcher.so \
libomp-devel-provider \
libomp.so \
libomp22-devel \
libompd.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
