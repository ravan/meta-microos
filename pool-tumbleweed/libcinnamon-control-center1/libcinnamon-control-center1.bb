SUMMARY = "Shared libraries for the Cinnamon configuration utilities"
DESCRIPTION = "This package provides shared libraries used by Cinnamon control \
centre applets."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later & MIT"

PV = "6.6.0"

RPM_NAME = "libcinnamon-control-center1-6.6.0-1.3.aarch64.rpm"
RPM_HASH = "671ea5efd636b4b0c820a28015f9b0823ad472ebc57c4be61c9653055666c5eea436582ac34edc2292632b3cb72a1c70ca5225e3a39fdc3c536127cfc469f782"

RPROVIDES:${PN} += "libcinnamon-control-center.so.1 \
libcinnamon-control-center1 \
libcolor.so \
libdisplay.so \
libnetwork.so \
libwacom-properties.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcolord.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libm.so.6 \
libmm-glib.so.0 \
libnm.so.0 \
libnma.so.0 \
libpango-1.0.so.0 \
libpolkit-gobject-1.so.0 \
libupower-glib.so.3 \
libwacom.so.9"

inherit rpm
