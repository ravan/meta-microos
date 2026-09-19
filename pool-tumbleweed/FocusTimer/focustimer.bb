SUMMARY = "A time management utility for GNOME"
DESCRIPTION = "A time management utility for GNOME based on the pomodoro technique."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "FocusTimer-1.1.4-1.1.aarch64.rpm"
RPM_HASH = "49cd4e889c2a93c5b7bfc73ea64455c33ae70aa1a13b7a09e2a7301477f959cdc9a00b263e1b4ffc1c9ac6e0ce62094245d04c3dbf82abebaf1577dc148d9109"

RPROVIDES:${PN} += "FocusTimer \
gnome-pomodoro"

RDEPENDS:${PN} += "-gnome-shell >= 46 with gnome-shell < 51 \
/sbin/ldconfig \
gstreamer \
gtk3 \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgom-1.0.so.0 \
libgraphene-1.0.so.0 \
libgstcontroller-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpeas-2.so.0 \
libsqlite3.so.0 \
libwayland-client.so.0"

inherit rpm
