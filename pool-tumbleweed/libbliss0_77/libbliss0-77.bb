SUMMARY = "Library for computing automorphism groups and canonical forms of graphs"
DESCRIPTION = "bliss is a tool for computing automorphism groups and canonical forms \
of graphs."
LICENSE = "LGPL-3.0-only"

PV = "0.77"

RPM_NAME = "libbliss0_77-0.77-1.19.aarch64.rpm"
RPM_HASH = "3b25203fd2e4eaa251e00526cecf76147f650bff1efc6889d3aadeeb0efbfe1010f75cde38adf6a0032c8c01bae3c263292bb16f78994183480df7c51b11a4b8"

RPROVIDES:${PN} += "libbliss.so.0.77 \
libbliss0-77"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libstdc++.so.6"

inherit rpm
