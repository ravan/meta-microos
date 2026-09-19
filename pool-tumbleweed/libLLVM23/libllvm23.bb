SUMMARY = "Libraries for LLVM"
DESCRIPTION = "This package contains the shared libraries needed for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "libLLVM23-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "1e14b37ed036f93b619395cd33ee78d43eb14872313e914130f6f70957080ac6fcd3b372326555d5e568d6529bdbc1321442262186de236f86cb899ec2240f96"

RPROVIDES:${PN} += "libLLVM.so.23.1 \
libLLVM23 \
libLLVMTableGen.so.23.1 \
libRemarks.so.23.1"

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
