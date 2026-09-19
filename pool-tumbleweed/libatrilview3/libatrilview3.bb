SUMMARY = "System library of the MATE Document Viewer"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and \
singlepage document formats like PDF and PostScript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.4"

RPM_NAME = "libatrilview3-1.28.4-1.2.aarch64.rpm"
RPM_HASH = "a1f844a6b2ce95a784e73f9a0548c512f4919ab5c413c3433afa47450953413bcd55cd4e81035b63ede9532b7dbb41ac33f9b7144bfa4bfe6493fb6c4afbbde4"

RPROVIDES:${PN} += "libatrilview.so.3 \
libatrilview3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libatrildocument.so.3 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libwebkit2gtk-4.1.so.0"

inherit rpm
