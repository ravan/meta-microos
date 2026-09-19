SUMMARY = "EPUB document reader library"
DESCRIPTION = "A GObject-based library for handling and rendering EPUB documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.3"

RPM_NAME = "libgepub-0_7-0-0.7.3-1.7.aarch64.rpm"
RPM_HASH = "d3d06288520131615bffc919fb83bb2421eab3d775869674c3dc28703acd5e946cffe762b6930ab97b5306a46a7d54a43eb5d20fb96f2848749e954f1fa470e7"

RPROVIDES:${PN} += "libgepub-0-7-0 \
libgepub-0.7.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjavascriptcoregtk-4.1.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.16"

inherit rpm
