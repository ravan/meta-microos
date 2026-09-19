SUMMARY = "GNOME Document Viewer System Library"
DESCRIPTION = "Papers is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "libppsview4_0-5-50.3-1.1.aarch64.rpm"
RPM_HASH = "f339d48970cb7482eec96591f18dde80537a5d0a40227bbe506723980413121befa16c17d3e8f8b0a88c7e44998b43ef8450b73e4bb826d05053f7e8aa38bdb3"

RPROVIDES:${PN} += "libppsview-4.0.so.5 \
libppsview4-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libppsdocument-4.0.so.6 \
libspelling-1.so.2"

inherit rpm
