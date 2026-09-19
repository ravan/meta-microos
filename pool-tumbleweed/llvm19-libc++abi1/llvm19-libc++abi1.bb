SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "llvm19-libc++abi1-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "bd8b0b489d7c022fccad9c57e82f59b228dcc5f6df0fa2c0140f2721c4c6058f2979ade7590a1569773f34c2694bcb4fe570f5d46a727c226f2361b0b68cd0c8"

RPROVIDES:${PN} += "libc++abi.so.1 \
libc++abi1 \
llvm19-libc++abi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
