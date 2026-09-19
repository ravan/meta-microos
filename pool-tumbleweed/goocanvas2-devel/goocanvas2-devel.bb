SUMMARY = "Development files for GooCanvas"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libgoocanvas."
LICENSE = "LGPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "goocanvas2-devel-2.0.4-5.6.aarch64.rpm"
RPM_HASH = "803157d1feafd56ea6a39896d78efd29764d5f60652b770e2d727ce5adc0eafb26c6b0d98ee2d667779e58567b399188e7be55ca4d10902cc394054e349fa110"

RPROVIDES:${PN} += "goocanvas2-devel \
pkgconfig-goocanvas-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgoocanvas-2-0-9 \
pkgconfig-cairo \
pkgconfig-gtk+-3.0 \
typelib-1-0-GooCanvas-2-0"

inherit rpm
