SUMMARY = "A font viewer utility for GNOME"
DESCRIPTION = "A utility to let you see the installed fonts at a glance."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-font-viewer-50.0-1.3.aarch64.rpm"
RPM_HASH = "b60879661f7ed1f0457df7593db95d9dbd46f317ab956c12f86fb014ec85518c9f25bca6d3d23473715da68e0e3da23b31713c9de3c65fda63804ade19bb550a"

RPROVIDES:${PN} += "gnome-font-viewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libharfbuzz.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
