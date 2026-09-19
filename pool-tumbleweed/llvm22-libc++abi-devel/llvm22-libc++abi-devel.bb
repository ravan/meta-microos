SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "llvm22-libc++abi-devel-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "b3e03e52535dc37fb0f411139d69886e4d5ec20be71838dc7f575d41f3ef28d386200e0a5b8085c978080620ff34b69d83d3f1bffe29945e24dfcbb04a85bdbc"

RPROVIDES:${PN} += "libc++abi.so \
llvm22-libc++abi-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++abi1"

inherit rpm
