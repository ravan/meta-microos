SUMMARY = "Development libraries and headers for libreport"
DESCRIPTION = "Development libraries and headers for libreport-gtk"
LICENSE = "GPL-2.0-or-later"

PV = "2.17.15"

RPM_NAME = "libreport-gtk_1-devel-2.17.15-1.13.aarch64.rpm"
RPM_HASH = "3a6aceea9eb83b663b0ce7ff8962f746633a30789295c87ef138135d9ae50e5ac81f414db2abd5a86e885cfde99f258db737aababd713cf883ebdd1b0beb299d"

RPROVIDES:${PN} += "libreport-gtk-1-devel \
pkgconfig-libreport-gtk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libreport-gtk-1 \
libreport-gtk.so.1 \
libreport.so.2 \
pkgconfig-libreport"

inherit rpm
