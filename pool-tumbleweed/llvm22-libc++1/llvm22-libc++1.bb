SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "llvm22-libc++1-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "f5b173a7119595456e682673be216e114c1f99f7e1f04a4cf18615ac864cbc2db15f3f8662365ecf91f6a746804779b3cceec2f032b85d7129a642c42c0d1691"

RPROVIDES:${PN} += "libc++.so.1 \
libc++1 \
llvm22-libc++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++abi.so.1 \
libc++abi1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
