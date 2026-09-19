SUMMARY = "A collection of different plugins for Geany"
DESCRIPTION = "Geany-Plugins is a collection of different plugins for Geany, \
a lightweight IDE."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.1"

RPM_NAME = "geany-plugins-2.1-2.5.aarch64.rpm"
RPM_HASH = "78a2baf60ea720386620f22d7cbe107514cdd39033ff5191d636fa255828d18d59645775ff1d56ffa461aa3064452c054df361abd0ff35a87353217d28da9b05"

RPROVIDES:${PN} += "geany-plugins \
libgeanypluginutils.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
geany \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libenchant-2.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgeany.so.0 \
libgio-2.0.so.0 \
libgit2.so.1.9 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libgtk-3.so.0 \
libgtkspell3-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libsoup-3.0.so.0 \
libvte-2.91.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.16"

inherit rpm
