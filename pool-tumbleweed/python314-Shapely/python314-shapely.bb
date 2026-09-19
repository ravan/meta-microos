SUMMARY = "Geospatial geometries, predicates, and operations"
DESCRIPTION = "Shapely is a Python package for manipulation and analysis of \
planar geometric objects. It is based on the GEOS (the \
engine of PostGIS) and JTS (from which GEOS is ported) libraries. \
Shapely is not concerned with data formats or coordinate systems, \
but can be readily integrated with packages that are like WorldMill \
and pyproj."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "python314-Shapely-2.1.2-1.5.aarch64.rpm"
RPM_HASH = "a9cac2fdfee8e7ba7a84a14488bddba638cd489eb332ba415f37310da550b8f185dcb1483eeeb63a27b816eab23797a76f1641f4ae414f0804fd5be67472cbf2"

RPROVIDES:${PN} += "lib.cpython-314-aarch64-linux-gnu.so \
python3.14dist-shapely \
python314-Shapely \
python314-shapely \
python3dist-shapely"

RDEPENDS:${PN} += "-python314-numpy >= 1.14 with python314-numpy < 3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgeos-c.so.1 \
libgeos3-14-1 \
python-abi"

inherit rpm
