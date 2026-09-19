SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "llvm19-libc++abi-devel-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "e6cd22291d6e83850a22ea00ad56991b16f5e374c0fef1926baceb69351ec805b9dec90b939f04acb9b050b94d29e94839bbc7008df9965904b7e7d2aa4f9cc2"

RPROVIDES:${PN} += "libc++abi.so \
llvm19-libc++abi-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++abi1"

inherit rpm
