SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "llvm19-libc++1-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "f1e183ddc5068792016c9ee3b78b6176c9bae9aefa50b58af366a7078dc66b75ef485341c2b1f3a4ea0ecae3feb2e30cc7d6660125dbd0cbb11c4a5773f651c2"

RPROVIDES:${PN} += "libc++.so.1 \
libc++1 \
llvm19-libc++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc++abi.so.1 \
libc++abi1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
