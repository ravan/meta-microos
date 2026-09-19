SUMMARY = "Environment for building spatially-enabled internet applications"
DESCRIPTION = "Mapserver is an internet mapping program that converts GIS data to \
map images in real time. With appropriate interface pages, \
Mapserver can provide an interactive internet map based on \
custom GIS data."
LICENSE = "MIT"

PV = "8.6.6"

RPM_NAME = "mapserver-8.6.6-1.1.aarch64.rpm"
RPM_HASH = "d481383dd556a07041d8149f74f74da93cb0549201d9ba3f0bbd99706bc9a9d5fd9a027087e698c3640e93834b9f54cba49339cc27de97684866ef72d025b330"

RPROVIDES:${PN} += "mapserver \
python2-mapserver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfcgi.so.0 \
libmapserver.so.2 \
libmapserver2 \
proj"

inherit rpm
