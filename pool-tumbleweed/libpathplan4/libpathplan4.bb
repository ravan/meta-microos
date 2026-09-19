SUMMARY = "Library for finding smooth shortest paths"
DESCRIPTION = "The pathplan library contains functions for finding shortest paths in polygons \
in fitting bezier curves to those paths."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "libpathplan4-15.0.0-2.2.aarch64.rpm"
RPM_HASH = "390ab10eaec263ea031425c1cef84481437ea583ad7732ae7ec3ca248b7c786a7cdce9d83d907c7162142df55de4bc912076df3a95fc49d9bc568377bb21fad0"

RPROVIDES:${PN} += "libpathplan.so.4 \
libpathplan4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmvec.so.1"

inherit rpm
