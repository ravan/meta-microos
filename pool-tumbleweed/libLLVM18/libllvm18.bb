SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "libLLVM18-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "9c5519aec2dd6a26fedd3a3f1c9c7b1429879fc80f24cee3ad101763b28e1ed035d7bffe855940f225d10f4a8d96895d301346f7fd20ed68f47798f2008d5fd6"

RPROVIDES:${PN} += "libLLVM.so.18.1 \
libLLVM18 \
libLLVMTableGen.so.18.1 \
libRemarks.so.18.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
