SUMMARY = "CD Player and Ripper for GNOME"
DESCRIPTION = "Goobox is a CD player and ripper that always knows just what to do."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "goobox-3.6.0-5.6.aarch64.rpm"
RPM_HASH = "0a475df93b94868b8a2eb0105d263829061ce5bca77a253cef6afe9ecd71428c8d3c43159e9536d5c5b6c1c57cf517a4c0c16441c93192d08e2d93c6469a468e"

RPROVIDES:${PN} += "goobox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrasero-media3.so.1 \
libc.so.6 \
libdiscid.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libmusicbrainz5.so.1 \
libpango-1.0.so.0"

inherit rpm
