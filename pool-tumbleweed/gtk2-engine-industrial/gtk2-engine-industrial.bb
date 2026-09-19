SUMMARY = "Industrial GTK+ 2 Theme Engine"
DESCRIPTION = "The Industrial engine provides a simple and consistent appearance for \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-industrial-2.20.2-23.6.aarch64.rpm"
RPM_HASH = "9c24a02a01a82d8a80f65a8ed10a7aa68fb1ea22387cfa024285b04a2d4327cfa1c72567d6db3a3439275435cdd0891e1028dae5788a734db37084369c1d4fc4"

RPROVIDES:${PN} += "gtk2-engine-industrial \
libindustrial.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
