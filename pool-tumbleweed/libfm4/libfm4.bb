SUMMARY = "Libfm libraries"
DESCRIPTION = "libfm main library"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libfm4-1.4.1-2.5.aarch64.rpm"
RPM_HASH = "a4e1b571917de9af6c43359caee53881dcc252c660d4846d0009c9d4a28fac1e4f9bc7597435821f234bfda5468caed937e7e0410c334d89e1931c73eb93cedc"

RPROVIDES:${PN} += "libfm.so.4 \
libfm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libexif.so.12 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmenu-cache.so.3"

inherit rpm
