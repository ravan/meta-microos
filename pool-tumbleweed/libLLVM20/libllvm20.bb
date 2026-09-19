SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "libLLVM20-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "977162075448503da6c32f0890c414209d8ae046fc13db4342c87db040d0d5a674e1e09cade1d3e1c5c02dda671ad203ece82e3689c7f34a531bb16ab23f9526"

RPROVIDES:${PN} += "libLLVM.so.20.1 \
libLLVM20 \
libLLVMTableGen.so.20.1 \
libRemarks.so.20.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
