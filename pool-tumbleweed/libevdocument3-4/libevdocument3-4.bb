SUMMARY = "GNOME Document Viewer System Library"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "48.4"

RPM_NAME = "libevdocument3-4-48.4-2.1.aarch64.rpm"
RPM_HASH = "8398b5ccaccb4af36ae7f74b17d6a03a66d547c567e7830cc3b427989b43517845a92ba4842f68ccd7045537a67d09073b5570464de9850debe69d76993904c6"

RPROVIDES:${PN} += "libevdocument3-4 \
libevdocument3.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libsynctex.so.2 \
libxml2.so.16"

inherit rpm
