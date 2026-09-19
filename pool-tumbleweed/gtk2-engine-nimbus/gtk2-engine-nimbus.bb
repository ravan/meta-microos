SUMMARY = "Nimbus GTK Theme Engine"
DESCRIPTION = "Nimbus is the name of a look-and-feel designed by Sun for the Java \
Desktop System."
LICENSE = "LGPL-2.0-or-later"

PV = "0.1.7"

RPM_NAME = "gtk2-engine-nimbus-0.1.7-15.4.aarch64.rpm"
RPM_HASH = "e80228e6154dcfd61e0f7ddb8b43e656d0db38f1625b1faa5fd5d35ed3965e0e6081273708181a40b7284a476d56c51c2da41ca4dedda69a04ef77affee38587"

RPROVIDES:${PN} += "gtk2-engine-nimbus \
libnimbus.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
