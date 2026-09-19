SUMMARY = "A simple GTK notification daemon"
DESCRIPTION = "A simple notification daemon with a GTK gui for notifications and the control center"
LICENSE = "GPL-3.0-only"

PV = "0.12.6"

RPM_NAME = "SwayNotificationCenter-0.12.6-1.3.aarch64.rpm"
RPM_HASH = "344845a355e7223f43280e79c0e0ae17393593ae27f064c645df62bb3c23009e3c313704b778b3bdb3f996de885e2baca9f92eaa47ba847c92983d11ec1afea6"

RPROVIDES:${PN} += "SwayNotificationCenter \
config-SwayNotificationCenter \
swaync"

RDEPENDS:${PN} += "gvfs \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libgtk4-layer-shell.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libwayland-client.so.0"

inherit rpm
