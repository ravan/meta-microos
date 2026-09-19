SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "libLLVM19-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "44b7d6910dbefcbc5251c5dcd5ef720a60ff4a2cde724dd3ca220925bb76d2da244a1432cc9a639123beb946f7ec5d3be64325a2b4f5f0dbafad7abd3aa4897b"

RPROVIDES:${PN} += "libLLVM.so.19.1 \
libLLVM19 \
libLLVMTableGen.so.19.1 \
libRemarks.so.19.1"

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
