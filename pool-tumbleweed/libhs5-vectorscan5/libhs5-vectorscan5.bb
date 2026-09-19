SUMMARY = "Regular expression matching library"
DESCRIPTION = "A fork of Intel's Hyperscan, modified to run on more platforms. \
 \
Vectorscan will follow Intel's API and internal algorithms where possible, \
but will not hesitate to make code changes where it is thought of giving \
better performance or better portability. In addition, the code will be \
gradually simplified and made more uniform and all architecture specific \
-currently Intel- #ifdefs will be removed and abstracted away."
LICENSE = "BSD-3-Clause"

PV = "5.4.12"

RPM_NAME = "libhs5-vectorscan5-5.4.12-1.4.aarch64.rpm"
RPM_HASH = "ae9d5716e883c64c12610cd2bd59dc45d76bc0ac373d54bcf3001c3b11cff09194f51508c97047e8f9fb9635dc2e01f8a2ad99d15ff2d39ec78077a3f0bc0c6e"

RPROVIDES:${PN} += "libhs-runtime.so.5 \
libhs.so.5 \
libhs5-vectorscan5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
