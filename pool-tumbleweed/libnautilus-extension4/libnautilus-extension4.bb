SUMMARY = "File Manager for the GNOME Desktop -- Extension Library"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package contains the library used by nautilus extensions."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "50.3.1"

RPM_NAME = "libnautilus-extension4-50.3.1-1.1.aarch64.rpm"
RPM_HASH = "a33900170e765b9299ffc9c6e733b4b26eaa15ddc95ace144ab188e6faf3b72fdcc84413a37c6ac36a70fb73db02e77647c07d93f2d3e97a1881e7adfb3440e8"

RPROVIDES:${PN} += "libnautilus-extension.so.4 \
libnautilus-extension4 \
libnautilus-image-properties.so \
libtotem-properties-page.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgexiv2-0.16.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglycin-2.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
