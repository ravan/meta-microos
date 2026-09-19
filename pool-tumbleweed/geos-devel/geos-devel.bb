SUMMARY = "Development files for GEOS"
DESCRIPTION = "GEOS (Geometry Engine - Open Source) is a C++ port of the Java Topology \
Suite (JTS). As such, it aims to contain the complete functionality of \
JTS in C++. This includes all the OpenGIS 'Simple Features for SQL' spatial \
predicate functions and spatial operators, as well as specific JTS topology \
functions such as IsValid() \
 \
This package contains the development files to build applications that \
use GEOS."
LICENSE = "LGPL-2.1-only"

PV = "3.15.0"

RPM_NAME = "geos-devel-3.15.0-1.1.aarch64.rpm"
RPM_HASH = "d8a25673f674b96f74557717be60a5e2cd2b6db02d14bf02933005d18602a30274a26caffe7b9fb86a34f219854f59ee224ac1af889191dd5254720b6f935e03"

RPROVIDES:${PN} += "cmake-geos \
geos-devel \
libgeos-devel \
pkgconfig-geos"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgeos-c1 \
libgeos3-15-0"

inherit rpm
