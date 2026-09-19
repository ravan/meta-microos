SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "libc++1-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "a829e048d206e287fd136643bb4a2925ef94d2f12ce0aa6c8221823a13c0bb70aa8b964ea89748e90972496199e34f6b7af8baf831a5de16e94eb1d7bd243550"

RPROVIDES:${PN} += "libc++.so.1 \
libc++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++abi.so.1 \
libc++abi1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
