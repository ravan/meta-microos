SUMMARY = "Development headers and libraries for voro++"
DESCRIPTION = "Voro++ is a software library for carrying out three-dimensional computations \
of the Voronoi tessellation. A distinguishing feature of the Voro++ library \
is that it carries out cell-based calculations, computing the Voronoi cell for \
each particle individually. It is particularly well-suited for applications that \
rely on cell-based statistics, where features of Voronoi cells (e.g. volume, \
centroid, number of faces) can be used to analyze a system of particles. \
 \
This package contains development headers and libraries for voro++."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "voro++-devel-0.4.6-4.5.aarch64.rpm"
RPM_HASH = "eaf0900421f768243c5319c7876fbc11ed4e2739ba286eb22c0eeaa3d4fbf1c5d82013d00b5822cae48e7480ec83168ff2c38b10c2698078d9d7ff7ecb6ec90d"

RPROVIDES:${PN} += "voro++-devel"

RDEPENDS:${PN} += "libvoro++0"

inherit rpm
