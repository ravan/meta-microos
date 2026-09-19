SUMMARY = "A Tool for Computing Automorphism Groups and Canonical Labelings of Graphs"
DESCRIPTION = "bliss is a tool for computing automorphism groups and canonical forms \
of graphs. It has both a command line user interface as well as C++ \
and C programming language APIs."
LICENSE = "LGPL-3.0-only"

PV = "0.77"

RPM_NAME = "bliss-0.77-1.19.aarch64.rpm"
RPM_HASH = "b7d474ccb0f120e061c84d1cd5a407c5a5591bf4248d63d095b7519283b7c971a34e1c926c613ac731df40b73e0028349b5d8e306e7eb51180f4b11033c76001"

RPROVIDES:${PN} += "bliss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbliss.so.0.77 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libstdc++.so.6"

inherit rpm
