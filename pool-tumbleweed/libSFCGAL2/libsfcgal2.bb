SUMMARY = "Libraries SFCGAL applications"
DESCRIPTION = "This library  support ISO 19107:2013, OGC Simple Features Access 1.2 for 3D operations. \
It provides standard compliant geometry types and operations, that can \
be accessed from its C or C++ APIs. PostGIS uses the C API, to expose some \
SFCGAL's functions in spatial databases (cf. PostGIS manual). \
 \
Geometry coordinates have an exact rational number representation and can \
be either 2D or 3D. Among supported geometry types are : \
 \
 Points \
 LineStrings \
 Polygons \
 TriangulatedSurfaces \
 PolyhedralSurfaces \
 GeometryCollections \
 Solids \
 \
Supported operations include : \
 \
 WKT reading and writing with exact rational number representation for coordinates \
 Intersection operations and predicates \
 Convex hull computation \
 Tessellation \
 Extrusion \
 Area and distance computation \
 Minkovski sums \
 Contour offsets \
 Straight skeleton generations"
LICENSE = "LGPL-2.0-or-later"

PV = "2.3.0"

RPM_NAME = "libSFCGAL2-2.3.0-1.1.aarch64.rpm"
RPM_HASH = "4098cced9bf64e16ce946a60059da799c4cc627967cdeb5477d336fa13a7cbacc7548d7ee27e10a337d541a1a360bf01c130696b0750af04b4710a401ee94a09"

RPROVIDES:${PN} += "libSFCGAL.so.2 \
libSFCGAL2 \
libsfcgal2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-serialization.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
