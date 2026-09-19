SUMMARY = "An image loading library"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "2.44.7"

RPM_NAME = "libgdk_pixbuf-2_0-0-2.44.7-1.2.aarch64.rpm"
RPM_HASH = "63117adbc95db469508bfd90eaa3f6ab712b171bd1b4777280a7d20e59d88da7977941be116d9881fad5aebedb5cef8ea3f15ef38e1e723a4404afc8ce41fc4d"

RPROVIDES:${PN} += "gdk-pixbuf \
libgdk-pixbuf-2-0-0 \
libgdk-pixbuf-2.0.so.0 \
libpixbufloader-ani.so \
libpixbufloader-bmp.so \
libpixbufloader-icns.so \
libpixbufloader-ico.so \
libpixbufloader-pnm.so \
libpixbufloader-qtif.so \
libpixbufloader-tga.so \
libpixbufloader-xbm.so \
libpixbufloader-xpm.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
gdk-pixbuf-query-loaders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglycin-2.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
