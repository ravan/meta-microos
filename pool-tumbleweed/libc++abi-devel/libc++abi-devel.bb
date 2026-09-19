SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "libc++abi-devel-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "0d940d747d4325171cfbfbf73bf24f73914ccc57bd78ca3186bafe6ec0cd27dd7e017720338dcfc981473800b6fd8e4ff02e0c823118f0808458c412ba143f38"

RPROVIDES:${PN} += "libc++abi-devel \
libc++abi.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++abi1"

inherit rpm
