SUMMARY = "Geospatial geometries, predicates, and operations"
DESCRIPTION = "Shapely is a Python package for manipulation and analysis of \
planar geometric objects. It is based on the GEOS (the \
engine of PostGIS) and JTS (from which GEOS is ported) libraries. \
Shapely is not concerned with data formats or coordinate systems, \
but can be readily integrated with packages that are like WorldMill \
and pyproj."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "python313-Shapely-2.1.2-1.5.aarch64.rpm"
RPM_HASH = "7fbd797e5f9fd89f9092d2bcd1f497042ecb52318b349f4b616371085730bfa24c6bc664ae1b11404b8fbba8a82ef916e43256ba5cdafbafd3fc2ece378e2f55"

RPROVIDES:${PN} += "lib.cpython-313-aarch64-linux-gnu.so \
python3-Shapely \
python3-shapely \
python3.13dist-shapely \
python313-Shapely \
python313-shapely \
python3dist-shapely"

RDEPENDS:${PN} += "-python313-numpy >= 1.14 with python313-numpy < 3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgeos-c.so.1 \
libgeos3-14-1 \
python-abi"

inherit rpm
