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

RPM_NAME = "libqhull_r8_0-2020.2-6.8.aarch64.rpm"
RPM_HASH = "faacc656369ffe01053cb9add5d9c1f6ae7de51cc866ff7a4054b3778007fa6d2f7d7cffc2c3ec3309dd966b548dfa3ae76ff6e3e97450c2a96eb7f99f7893e9"

RPROVIDES:${PN} += "libqhull-r.so.8.0 \
libqhull-r8-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
