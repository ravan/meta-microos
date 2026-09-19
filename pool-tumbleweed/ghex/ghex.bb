SUMMARY = "GNOME Binary Editor"
DESCRIPTION = "GHex allows the user to load data from any file and to view and edit it \
in either hex or ASCII. It is a must for anyone playing games that use \
a non-ASCII format for saving."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "ghex-50.3-1.1.aarch64.rpm"
RPM_HASH = "57ae6aa98a561b44f9eafbb5ddb4c997f766fc587460d3932e1e73801907f784b27de2f5e42abb465a55300a29d28f9640ac1f82556118f05cdd4c29d19db368"

RPROVIDES:${PN} += "ghex \
libhex-buffer-direct.so \
libhex-buffer-mmap.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtkhex-4.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
