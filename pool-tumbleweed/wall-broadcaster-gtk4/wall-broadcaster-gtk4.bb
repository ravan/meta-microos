SUMMARY = "GTK4 application showing wall broadcast messages"
DESCRIPTION = "This package contains a GTK4 application, which watches for dbus \
messages from wall-broadcaster and displays them."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1+git20260806.19775bc"

RPM_NAME = "wall-broadcaster-gtk4-0.4.1+git20260806.19775bc-1.1.aarch64.rpm"
RPM_HASH = "a743e071088018067156c534b756675122175354cfa19b2b46680e10720eedab2b3822166cbf4cf61268b976e5432577a9774d486f7cbc59a2194998a4fb1f00"

RPROVIDES:${PN} += "wall-broadcaster-gtk4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
