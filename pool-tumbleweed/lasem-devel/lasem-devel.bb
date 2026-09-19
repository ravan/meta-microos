SUMMARY = "Development files for lasem, a MathML and SVG rendering library"
DESCRIPTION = "Lasem is a library for rendering SVG and MathML, implementing a DOM like API. \
It's based on GObject and uses Pango and Cairo for the rendering."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.4"

RPM_NAME = "lasem-devel-0.4.4-4.14.aarch64.rpm"
RPM_HASH = "34a05180c06694c5ee671a5a58de845f64ee1ce1242bc40412905c2a45ba26545def458a4ffa76f8c4b679ebac754d32d6c78c563a37b40138c2c4d34371c0fc"

RPROVIDES:${PN} += "lasem-devel \
pkgconfig-lasem-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblasem-0-4-4 \
pkgconfig-cairo \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0 \
pkgconfig-pangocairo"

inherit rpm
