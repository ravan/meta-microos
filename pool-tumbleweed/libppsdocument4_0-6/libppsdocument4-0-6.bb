SUMMARY = "GNOME Document Viewer System Library"
DESCRIPTION = "Papers is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "libppsdocument4_0-6-50.3-1.1.aarch64.rpm"
RPM_HASH = "5a6e3d478bfd54bfa1e5a8f5ae723d9e1df03fbd9116abdd0bb437d93ce8f14e38526fe26f1a117252ef19857f5c2e80192c04036b45cf42809f82eaeb4dc179"

RPROVIDES:${PN} += "libppsdocument-4.0.so.6 \
libppsdocument4-0-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libexempi.so.8 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
