SUMMARY = "Voronoi tessellation library"
DESCRIPTION = "Voro++ is a software library for carrying out three-dimensional computations \
of the Voronoi tessellation. A distinguishing feature of the Voro++ library \
is that it carries out cell-based calculations, computing the Voronoi cell for \
each particle individually. It is particularly well-suited for applications that \
rely on cell-based statistics, where features of Voronoi cells (e.g. volume, \
centroid, number of faces) can be used to analyze a system of particles."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "voro++-0.4.6-4.5.aarch64.rpm"
RPM_HASH = "40beaabc2fc66a35f673b3b93038dad9e70f8736141fcb66ea33100d8a60344fd798ee9c89af4d1de049dfbcfe0919772a4904c90f1b94a88148faf83b529204"

RPROVIDES:${PN} += "voro++"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvoro++.so.0"

inherit rpm
