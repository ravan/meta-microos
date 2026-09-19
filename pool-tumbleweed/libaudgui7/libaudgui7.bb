SUMMARY = "GTK GUI implementation of Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.6.1"

RPM_NAME = "libaudgui7-4.6.1-1.3.aarch64.rpm"
RPM_HASH = "4ab798fab78959f92583408e52a59977525041abe02ed230f2c5a28c5a01302c5bea2700873c9966bf7548c8633ba791cd032a03407be13f41f3736011e75887"

RPROVIDES:${PN} += "libaudgui.so.7 \
libaudgui7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudcore.so.6 \
libaudcore6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
