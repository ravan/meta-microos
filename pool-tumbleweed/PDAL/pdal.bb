SUMMARY = "Point Data Abstraction Library (GDAL for point cloud data)"
DESCRIPTION = "PDAL is a C++ BSD library for translating and manipulating point cloud data. \
It is very much like the GDAL library which handles raster and vector data. \
 \
In addition to the library code, PDAL provides a suite of command-line \
applications that users can conveniently use to process, filter, translate, \
and query point cloud data. See Applications for more information. \
 \
This package provides tools & utilities using PDAL library libpdal"
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & BSL-1.0"

PV = "2.10.2"

RPM_NAME = "PDAL-2.10.2-1.1.aarch64.rpm"
RPM_HASH = "b697822e37355a53df95b3e4e83b70b22cbb5bb42737cba521795c000405cfd0155687ec1a58017c138e5230fac2b49d08b6e1cc3eadd49be31c1315f27b8298"

RPROVIDES:${PN} += "PDAL \
bundled-PoissonRecon \
bundled-arbiter \
bundled-nanoflann \
pdal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libPDAL20 \
libc.so.6 \
libgcc-s.so.1 \
libpdalcpp.so.20 \
libstdc++.so.6"

inherit rpm
