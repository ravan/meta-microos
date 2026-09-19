SUMMARY = "GNOME Document Viewer"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript. \
 \
Separate plugin packages, e.g. evince-plugin-pdfdocument, need to be present \
for certain formats to be recognized."
LICENSE = "GPL-2.0-or-later"

PV = "48.4"

RPM_NAME = "evince-48.4-2.1.aarch64.rpm"
RPM_HASH = "15beb2ad05b153901f8589a810a1e83917f69b9ed19884a991efaf742853cfffbc9b4562b0eb56bf37e25e28611e5f449cc8af7ca17a9cc58b7ad8dba0f8c5bc"

RPROVIDES:${PN} += "evince \
evince-browser-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libevdocument3.so.4 \
libevview3.so.3 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3.so.20 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsecret-1.so.0"

inherit rpm
