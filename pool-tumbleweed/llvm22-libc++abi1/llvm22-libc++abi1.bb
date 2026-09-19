SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "llvm22-libc++abi1-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "5dd56793eae6226f9c19997af9f82e04ce951ccf4f1f942a8ef091cc5c3cca759e7ed49da48d829c03e9a57383fab415a67f137b65fc4b394dd06ad4f8a927e8"

RPROVIDES:${PN} += "libc++abi.so.1 \
libc++abi1 \
llvm22-libc++abi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
