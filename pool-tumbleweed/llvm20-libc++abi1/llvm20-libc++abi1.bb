SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "llvm20-libc++abi1-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "29921cbde9a637cb3479e83213e49fa4cdb02bd33827d224a97fa978f3c7f3eb2cadc1ad12923d296b1a3a511242de2f1fe9c50c0d3ccfa66f8a0c07c979a9e7"

RPROVIDES:${PN} += "libc++abi.so.1 \
libc++abi1 \
llvm20-libc++abi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
