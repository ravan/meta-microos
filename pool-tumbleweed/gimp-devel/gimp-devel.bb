SUMMARY = "The GNU Image Manipulation Program"
DESCRIPTION = "The GIMP is an image composition and editing program. GIMP offers \
many tools and filters, and provides a large image manipulation \
toolbox and scripting. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of the GIMP libraries."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.6"

RPM_NAME = "gimp-devel-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "842feedce48c3518c01ade179b2c4b56751b5f651f777682b1bec18dce749fef297b12683861459c1cb434ddcb0493ffc431bc2101a796bf20b20a6b3ca4d9d3"

RPROVIDES:${PN} += "gimp-3.0-devel \
gimp-devel \
gimp-doc \
pkgconfig-gimp-3.0 \
pkgconfig-gimpthumb-3.0 \
pkgconfig-gimpui-3.0 \
rpm-macro-gimp-abi-version \
rpm-macro-gimp-api-version"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgimp-3-0-0 \
libgimpbase-3.0.so.0 \
libgimpui-3-0-0 \
libglib-2.0.so.0 \
pkgconfig-cairo \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gegl-0.4 \
pkgconfig-gexiv2 \
pkgconfig-gimp-3.0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-lcms2 \
pkgconfig-pango \
pkgconfig-pangoft2"

inherit rpm
