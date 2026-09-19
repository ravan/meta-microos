SUMMARY = "A GTK4 BitTorrent Client"
DESCRIPTION = "Fragments is an easy to use BitTorrent client which follows the \
GNOME HIG and includes well thought-out features."
LICENSE = "GPL-3.0-only"

PV = "3.0.1+git339.902a2b5"

RPM_NAME = "Fragments-3.0.1+git339.902a2b5-2.4.aarch64.rpm"
RPM_HASH = "dbf951898d899eb064d35141e2794b8a97a228d2749f4761d1e10450b7f714a6803ac7552b492d415e90386fad60cd648f92f8268c69932fe80b33557c96b93a"

RPROVIDES:${PN} += "Fragments"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libssl.so.3 \
transmission-daemon"

inherit rpm
