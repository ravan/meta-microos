SUMMARY = "Library files for chrono"
DESCRIPTION = "Library files for chrono."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "libchrono0-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "14f1a37fb11bebdd97eebfc37842b12373f55f6034a3cab3664030270ba5499e9deb964cb8d59f5de26100671c41418af3d6d7099e710b585556fdda9450cf29"

RPROVIDES:${PN} += "libchrono.so.0 \
libchrono0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
