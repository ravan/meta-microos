SUMMARY = "Development and documentation files for qhull"
DESCRIPTION = "Qhull computes the convex hull, Delaunay triangulation, Voronoi diagram, \
halfspace intersection about a point, furthest-site Delaunay triangulation, \
and furthest-site Voronoi diagram. \
 \
This package contains the header files for the Qhull libraries."
LICENSE = "Qhull"

PV = "2020.2"

RPM_NAME = "qhull_r-devel-2020.2-6.8.aarch64.rpm"
RPM_HASH = "a5e6926e6a8559f1cab0ec1db405cecc0b9b1dd5836276c0f0bcbf0e1573924a0bfa52126868cf57d0f44d88af3dfc82ffde59cb9eeea9712e0272b4f9448da0"

RPROVIDES:${PN} += "cmake-Qhull \
pkgconfig-qhull-r \
qhull-devel \
qhull-r-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqhull-r8-0"

inherit rpm
