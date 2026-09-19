SUMMARY = "SVG Convert using the GNOME Render SVG library"
DESCRIPTION = "This package contains a tool to convert SVG (scalable vector \
graphics) data. This format has been specified by the W3C (see \
http://www.w3c.org)."
LICENSE = "LGPL-2.0-or-later"

PV = "2.62.3"

RPM_NAME = "rsvg-convert-2.62.3-2.2.aarch64.rpm"
RPM_HASH = "23b4c24788b28e82578aed57251bf4c49b01b8d1326494deeb6bc11c78d12112550b678809833fe54318e11c539aa7bbcc78a1eea9347e25f218841969fdfc59"

RPROVIDES:${PN} += "rsvg-convert"

RDEPENDS:${PN} += "libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libdav1d.so.7 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.16"

inherit rpm
