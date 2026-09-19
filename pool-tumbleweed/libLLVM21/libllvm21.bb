SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "libLLVM21-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "01c04f286884504c2d74ee96e3fda820dcb2448ee87b9df4f4f7b44f2918e498e135464ae57f1132c1c85446b060f29d0ae5e629230f329a1ef6e2862ff11a27"

RPROVIDES:${PN} += "libLLVM.so.21.1 \
libLLVM21 \
libLLVMTableGen.so.21.1 \
libRemarks.so.21.1"

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
