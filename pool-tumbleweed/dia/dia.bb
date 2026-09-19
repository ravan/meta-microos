SUMMARY = "A Diagram Creation Program"
DESCRIPTION = "Dia is designed to be much like the commercial program 'Visio.' It can \
be used to draw many different kinds of diagrams. It has special \
objects to help draw entity relationship diagrams, UML diagrams, SADT, \
flowcharts, network diagrams, and simple circuits. It is possible to \
add support for new shapes by writing simple XML files, and using a \
subset of SVG to draw the shape. \
 \
Dia can load and save diagrams to a custom XML format (gzipped by \
default to save space), can export diagrams to EPS, PNG, CGM, or SVG \
formats, and can print diagrams (including ones that span multiple \
pages)."
LICENSE = "GPL-2.0-or-later"

PV = "0.97.3"

RPM_NAME = "dia-0.97.3-18.6.aarch64.rpm"
RPM_HASH = "227924f9346fb6d835adc40be5a2c0c78254d62adc13434c32abd139b3428069d38945699989917ffcee61cfa6ebf832ea3d0fb5a4777db889b191e4e0e3f989"

RPROVIDES:${PN} += "dia \
libaadl-objects.so \
libart-filter.so \
libcairo-filter.so \
libcgm-filter.so \
libchronogram-objects.so \
libcustom-lines-objects.so \
libcustom-objects.so \
libdb-objects.so \
libdia.so \
libdxf-filter.so \
liber-objects.so \
libflowchart-objects.so \
libfs-objects.so \
libgrafcet-objects.so \
libhpgl-filter.so \
libistar-objects.so \
libjackson-objects.so \
libkaos-objects.so \
libmetapost-filter.so \
libmisc-objects.so \
libnetwork-objects.so \
libpgf-filter.so \
libpixbuf-filter.so \
libpostscript-filter.so \
libpstricks-filter.so \
libsadt-objects.so \
libshape-filter.so \
libstandard-objects.so \
libsvg-filter.so \
libuml-objects.so \
libvdx-filter.so \
libwmf-filter.so \
libwpg-filter.so \
libxfig-filter.so \
libxslt-filter.so"

RDEPENDS:${PN} += "ghostscript-fonts-std \
ld-linux-aarch64.so.1 \
libEMF.so.1 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpng16.so.16 \
libxml2.so.16 \
libxslt.so.1 \
libz.so.1 \
xdg-utils"

inherit rpm
