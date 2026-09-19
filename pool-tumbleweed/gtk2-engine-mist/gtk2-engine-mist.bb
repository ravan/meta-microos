SUMMARY = "Mist GTK+ 2 Theme Engine"
DESCRIPTION = "The Mist engine is a minimalist engine designed to provide a simple UI \
experience."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-mist-2.20.2-23.6.aarch64.rpm"
RPM_HASH = "502eeac1b9787a9c4645dfb6121377de8d6762d5642c2039e97ceae366fc1fb388160ab3c5e8c12c7104aaa552164276c83911fab4fa16ac023efc911415c69a"

RPROVIDES:${PN} += "gtk2-engine-mist \
libmist.so"

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
