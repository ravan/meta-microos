SUMMARY = "Graph Coloring Library for C/C++ -- development files"
DESCRIPTION = "This package provides algorithms for efficient solution of partitioning \
problems occuring in the analysis of sparsity patterns in derivative \
computations formulated as Graph Coloring problems. \
 \
For details see http://www.cscapes.org/coloringpage/software.htm \
 \
This package provides the development environment for ColPack"
LICENSE = "LGPL-3.0"

PV = "1.0.10"

RPM_NAME = "ColPack-devel-1.0.10-2.5.aarch64.rpm"
RPM_HASH = "7256e58204db1fc66858f17ae927ee3370b20070815723e4b74c13a72ead9f22c2fd1bca1681699032be2286a80bc4c1ba7bb0ee66def4a5d2972f49e7be1c20"

RPROVIDES:${PN} += "ColPack-devel"

RDEPENDS:${PN} += "libColPack0"

inherit rpm
