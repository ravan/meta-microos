SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "llvm18-libc++abi-devel-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "292cc5caf31772e3e2b0e574a39f4354c1a6f8aaffa02c56b5aefa9d829dd9168f08e2c43b1d6b6fde9edbcbc578804f5bd9ca310911c5b5d96f58f1a98a8cfc"

RPROVIDES:${PN} += "libc++abi.so \
llvm18-libc++abi-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++abi1"

inherit rpm
