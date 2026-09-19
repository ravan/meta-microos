SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "libLLVM22-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "f3fc1b638b563389d203cb5e5d445b0d900d2e023a3649ceb06935cae38386a64b3f76c7b3525622ba91a25d20a762fc944957ab44d51ec3f7cc120a6b8eac45"

RPROVIDES:${PN} += "libLLVM.so.22.1 \
libLLVM22 \
libLLVMTableGen.so.22.1 \
libRemarks.so.22.1"

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
