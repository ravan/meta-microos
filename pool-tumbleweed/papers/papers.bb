SUMMARY = "GNOME Document Viewer"
DESCRIPTION = "Papers is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "papers-50.3-1.1.aarch64.rpm"
RPM_HASH = "5facebb551d845d41395e49be89a36a79e1ebec0792d5077ea0062d63ab3d373cb3bf7578c7c7e950334ba5f301da656d7d9b30135ba62b8e5a1c01eccff09b9"

RPROVIDES:${PN} += "papers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libppsdocument-4.0.so.6 \
libppsview-4.0.so.5"

inherit rpm
