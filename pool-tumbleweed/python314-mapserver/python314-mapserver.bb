SUMMARY = "Environment for building spatially-enabled internet applications"
DESCRIPTION = "Mapserver is an internet mapping program that converts GIS data to \
map images in real time. With appropriate interface pages, \
Mapserver can provide an interactive internet map based on \
custom GIS data."
LICENSE = "MIT"

PV = "8.6.6"

RPM_NAME = "python314-mapserver-8.6.6-1.1.aarch64.rpm"
RPM_HASH = "3b2272068adc6cfac33696fcb956027b91ab60cd18f60becd5c5abfc13d2a988e2fabad3f6d83044644595a3e7c8e4461429576d42d5f4cc0f11cc1b538596ef"

RPROVIDES:${PN} += "python3.14dist-mapscript \
python314-mapserver \
python3dist-mapscript"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmapserver.so.2 \
libmapserver2 \
libpython3.14.so.1.0 \
proj \
python-abi"

inherit rpm
