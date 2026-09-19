SUMMARY = "Clipboard management system for GNOME"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface."
LICENSE = "BSD-2-Clause"

PV = "50.9"

RPM_NAME = "gpaste-50.9-1.1.aarch64.rpm"
RPM_HASH = "5d9e4e21523b011cdc385065e1f64f6af40c3687b58424c56157d9fc68515fff3a8281db978f9a438fd20c968eadf8caba4d01c54bc611fbed06cf44f590bb61"

RPROVIDES:${PN} += "gpaste"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libadwaita-1.so.0 \
libc.so.6 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpaste-2.so.0 \
libgpaste-gtk4.so.1 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
