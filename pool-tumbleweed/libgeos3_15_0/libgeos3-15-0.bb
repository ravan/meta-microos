SUMMARY = "Geometry Engine library"
DESCRIPTION = "GEOS (Geometry Engine - Open Source) is a C++ port of the Java Topology \
Suite (JTS). As such, it aims to contain the complete functionality of JTS \
in C++. This includes all the OpenGIS 'Simple Features for SQL' spatial \
predicate functions and spatial operators, as well as specific JTS topology \
functions such as IsValid()."
LICENSE = "LGPL-2.1-only"

PV = "3.15.0"

RPM_NAME = "libgeos3_15_0-3.15.0-1.1.aarch64.rpm"
RPM_HASH = "27e122fa08f84c985e7b6ccf73415c2f9636581d51bf6d583eb02bd742e6f95b6743c9070f72aa3b28803e9a691b46acca1dce1d66a797122ba681f737ca67d8"

RPROVIDES:${PN} += "libgeos.so.3.15.0 \
libgeos3-15-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
