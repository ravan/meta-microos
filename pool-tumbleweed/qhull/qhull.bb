SUMMARY = "Computing convex hulls, Delaunay triangulations and Voronoi diagrams"
DESCRIPTION = "Qhull computes the convex hull, Delaunay triangulation, Voronoi diagram, \
halfspace intersection about a point, furthest-site Delaunay triangulation, \
and furthest-site Voronoi diagram. The source code runs in 2D \
and higher dimensions. Qhull implements the Quickhull algorithm for computing \
the convex hull. It handles roundoff errors from floating point arithmetic. It \
computes volumes, surface areas, and approximations to the convex hull. \
 \
Qhull does not support constrained Delaunay triangulations, triangulation of \
non-convex surfaces, mesh generation of non-convex objects, or medium-sized \
inputs in 9-D and higher."
LICENSE = "Qhull"

PV = "2020.2"

RPM_NAME = "qhull-2020.2-6.8.aarch64.rpm"
RPM_HASH = "dec63313022adf523fa327da8956cc96c686b025c016166fa37e98bb35297f118dde6eb156dd281f8dee0f983bc03446e193e955947e2e9e8ea7fbbce410529d"

RPROVIDES:${PN} += "qhull"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libqhull-r.so.8.0"

inherit rpm
