SUMMARY = "Fast and functional graphics viewer"
DESCRIPTION = "xviewer is a simple graphics viewer for the Cinnamon desktop and \
others which uses the gdk-pixbuf library. It can deal with large \
images, and zoom and scroll with constant memory usage. Its goals \
are simplicity and standards compliance."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.4.16"

RPM_NAME = "xviewer-3.4.16-2.3.aarch64.rpm"
RPM_HASH = "9ed3a40441d1d174e5a0723f6b31a6afd27b99604f5a726a919b46ee7b013b972afaa23877fe98946af72f99caa695152fd29c9a3eb2591b2dd41c51765febe5"

RPROVIDES:${PN} += "xviewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxviewer.so \
xapps-common"

inherit rpm
