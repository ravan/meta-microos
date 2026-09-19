SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "llvm18-libc++abi1-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "c0af89237de96b05ce3d8c21bc6b305db44b0a8fb5a251c204035e93e669ad1bd4f29c6d5ff6aa52963b308d34aa9246fe11246e7533fad52d521f93b3f8f88f"

RPROVIDES:${PN} += "libc++abi.so.1 \
libc++abi1 \
llvm18-libc++abi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
