SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "llvm21-libc++abi-devel-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "4712bbbbd1bc35eb9e3af42770484e2cbaccea8e2f51a16597e679e7710c8ff25706083a6b7d92a9266b67f045055d142d7b274a1df19495af593441405075f6"

RPROVIDES:${PN} += "libc++abi.so \
llvm21-libc++abi-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++abi1"

inherit rpm
