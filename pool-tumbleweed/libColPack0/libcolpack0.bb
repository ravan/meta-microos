SUMMARY = "Graph Coloring Library for C/C++"
DESCRIPTION = "This package provides algorithms for efficient solution of partitioning \
problems occuring in the analysis of sparsity patterns in derivative \
computations formulated as Graph Coloring problems. \
 \
For details see http://www.cscapes.org/coloringpage/software.htm"
LICENSE = "LGPL-3.0"

PV = "1.0.10"

RPM_NAME = "libColPack0-1.0.10-2.5.aarch64.rpm"
RPM_HASH = "b5af3bcd3b328d10d610cf85e533db6483c575a8ac27de4191c31e319327242ab01b8317d02d185d4db424ab17280e0c5ddaeb9aa48e989193d29a0f29837d41"

RPROVIDES:${PN} += "libColPack.so.0 \
libColPack0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
