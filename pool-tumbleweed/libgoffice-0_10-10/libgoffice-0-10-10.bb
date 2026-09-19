SUMMARY = "GLib/GTK+ Set of Document-Centric Objects and Utilities"
DESCRIPTION = "GOffice is a GLib/GTK+ set of document-centric objects and utilities. \
 \
These are common operations for document-centric applications that are \
conceptually simple, but complex to implement fully: plug-ins, load and \
save documents, undo and redo."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.10.61"

RPM_NAME = "libgoffice-0_10-10-0.10.61-1.3.aarch64.rpm"
RPM_HASH = "825b67ced140a26c61f218c8b6632f821c2dda70460706a27ff9710cb86afba1ea1cdfe69566680a14506376e459b81eb77b6cae27ea6eaa503db24783aa2628"

RPROVIDES:${PN} += "goffice \
libgoffice-0-10-10 \
libgoffice-0.10.so.10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libgtk-3.so.0 \
liblasem-0.4.so.4 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2 \
libspectre.so.1 \
libxml2.so.16 \
libxslt.so.1"

inherit rpm
