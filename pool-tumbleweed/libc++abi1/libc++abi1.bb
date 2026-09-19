SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "libc++abi1-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "8f6ec49bf9aef249224c47e45c9d88441439eb94902edf4a2328436a6d82fb74723608cfab24a8903d1a545cd586de43c3b2fd5c189ba809846ac583c8b38e14"

RPROVIDES:${PN} += "libc++abi.so.1 \
libc++abi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
