SUMMARY = "A calendar application for GNOME"
DESCRIPTION = "Calendar is a calendar application for GNOME."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-calendar-50.0-1.3.aarch64.rpm"
RPM_HASH = "e3c45d04a89c23e33f3e35c269ee10c36bd78e0e2d61310f424e10416110535e7f0d52013e983a6494f1890cd628344c1af251c7f555a6ff312694ce394d116e"

RPROVIDES:${PN} += "gnome-calendar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libedataserverui4-1.0.so.0 \
libfribidi.so.0 \
libgeoclue-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libgweather-4.so.0 \
libical-glib.so.3 \
libm.so.6 \
libsoup-3.0.so.0"

inherit rpm
