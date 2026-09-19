SUMMARY = "Voronoi tessellation library"
DESCRIPTION = "Voro++ is a software library for carrying out three-dimensional computations \
of the Voronoi tessellation. A distinguishing feature of the Voro++ library \
is that it carries out cell-based calculations, computing the Voronoi cell for \
each particle individually. It is particularly well-suited for applications that \
rely on cell-based statistics, where features of Voronoi cells (e.g. volume, \
centroid, number of faces) can be used to analyze a system of particles. \
 \
This package contains the voro++ library."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "libvoro++0-0.4.6-4.5.aarch64.rpm"
RPM_HASH = "4ca44e29e1474d877a461827d5528bf8df3695e6e7f3a35a1e27d7754a49db2353597b20ebfe24040866d0390f18f8f3101385e3eb689a50d94eb432fef5710f"

RPROVIDES:${PN} += "libvoro++.so.0 \
libvoro++0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
