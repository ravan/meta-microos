SUMMARY = "Development and documentation files for qhull - C++ interface"
DESCRIPTION = "Qhull computes the convex hull, Delaunay triangulation, Voronoi diagram, \
halfspace intersection about a point, furthest-site Delaunay triangulation, \
and furthest-site Voronoi diagram. \
 \
This package contains the header files and static lib for Qhull's C++ interface."
LICENSE = "Qhull"

PV = "2020.2"

RPM_NAME = "qhullcpp-devel-static-2020.2-6.8.aarch64.rpm"
RPM_HASH = "c5ce0b707faeb8dbd3891b2625c938921a7b22ab769831ba03357facf3bf51e93a56ce76f62cabeb5819c41beac22c65040f6472b756b9bcbcff18706d28a137"

RPROVIDES:${PN} += "pkgconfig-qhullcpp \
qhullcpp-devel-static"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqhull-r8-0"

inherit rpm
