SUMMARY = "A terminal for GNOME with first-class support for containers"
DESCRIPTION = "Ptyxis is a terminal for GNOME with first-class support for containers."
LICENSE = "GPL-3.0-or-later"

PV = "50.1"

RPM_NAME = "ptyxis-50.1-1.3.aarch64.rpm"
RPM_HASH = "45566c084fe6e4b81b9a9d2daee5a84520ed5acf5ae16f0270f077dd11b528aa5118bd706e40c1957bd6b09fd93b8dba2945fc108f61467e25ccff348f953409"

RPROVIDES:${PN} += "ptyxis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libportal-gtk4.so.1 \
libportal.so.1 \
libvte-2.91-gtk4.so.0"

inherit rpm
