SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "llvm18-libc++1-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "9df0a66d2c283b08185ddebbe7d0d7f7171e3bca2cbfa4efa1dc425a6303e3ca88c5437baf98e27eadf6599ea1381ae5aea6bc9741010cbbd47ceda878a0156d"

RPROVIDES:${PN} += "libc++.so.1 \
libc++1 \
llvm18-libc++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc++abi.so.1 \
libc++abi1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
