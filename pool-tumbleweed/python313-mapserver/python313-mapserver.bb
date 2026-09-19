SUMMARY = "Environment for building spatially-enabled internet applications"
DESCRIPTION = "Mapserver is an internet mapping program that converts GIS data to \
map images in real time. With appropriate interface pages, \
Mapserver can provide an interactive internet map based on \
custom GIS data."
LICENSE = "MIT"

PV = "8.6.6"

RPM_NAME = "python313-mapserver-8.6.6-1.1.aarch64.rpm"
RPM_HASH = "8307697b34e32674f5a66f1ba73cfc7859f3f985e8c9a22d158725f95a86da858b27ff4a0a5e76a9a119215077e65e8cf2027a4b0071d1e32460fadbda06ed20"

RPROVIDES:${PN} += "python3-mapserver \
python3.13dist-mapscript \
python313-mapserver \
python3dist-mapscript"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmapserver.so.2 \
libmapserver2 \
libpython3.13.so.1.0 \
proj \
python-abi"

inherit rpm
