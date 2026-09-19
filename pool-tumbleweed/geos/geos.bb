SUMMARY = "Geometry Engine - Open Source"
DESCRIPTION = "GEOS (Geometry Engine - Open Source) is a C++ port of the Java Topology \
Suite (JTS). As such, it aims to contain the complete functionality of JTS \
in C++. This includes all the OpenGIS 'Simple Features for SQL' spatial \
predicate functions and spatial operators, as well as specific JTS topology \
functions such as IsValid()."
LICENSE = "LGPL-2.1-only"

PV = "3.15.0"

RPM_NAME = "geos-3.15.0-1.1.aarch64.rpm"
RPM_HASH = "10296772454f05081061c9b58f29fed619f5644512454ad3cb622a02e00da6753f5e951387d7dca11e4e23fbabbadb56e73490200b258bbd7457622c0b02e615"

RPROVIDES:${PN} += "geos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgeos.so.3.15.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
