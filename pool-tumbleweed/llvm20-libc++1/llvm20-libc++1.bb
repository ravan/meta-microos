SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "llvm20-libc++1-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "15d7ab2922b61ee7c27427aa477673bf67357e0af024aa76c122f06be11028920f39ade4a3359980f3608f79a04830fefe64d1a9c414d43c2c07869f8dd88642"

RPROVIDES:${PN} += "libc++.so.1 \
libc++1 \
llvm20-libc++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc++abi.so.1 \
libc++abi1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
