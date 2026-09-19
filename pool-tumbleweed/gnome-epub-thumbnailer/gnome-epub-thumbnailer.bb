SUMMARY = "Thumbnailer for EPub books"
DESCRIPTION = "Thumbnailer for EPub books."
LICENSE = "GPL-2.0-or-later"

PV = "1.8"

RPM_NAME = "gnome-epub-thumbnailer-1.8-1.10.aarch64.rpm"
RPM_HASH = "7511e060e7acd24a2a16a93b01b291bbbb226ad4dc6e0b79482bbc88ef0798ea2f35ecdb330c68c0dffe8612e24800daebc6938fd9c11ce79ac11197f890bdcf"

RPROVIDES:${PN} += "gnome-epub-thumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxml2.so.16"

inherit rpm
