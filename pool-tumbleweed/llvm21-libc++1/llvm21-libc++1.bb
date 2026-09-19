SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "llvm21-libc++1-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "19c36031f4b9a30e030e3100a943e05ec01bea7a7a340042ebc464c07835b1c5268a8484a7ab78858b30b7e62bcf13d9de7f0e3d46e3a9404da47f1541db1d32"

RPROVIDES:${PN} += "libc++.so.1 \
libc++1 \
llvm21-libc++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc++abi.so.1 \
libc++abi1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
