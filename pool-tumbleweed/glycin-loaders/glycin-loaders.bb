SUMMARY = "Sandboxed image rendering"
DESCRIPTION = "Sandboxed and extendable image decoding."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "2.1.5"

RPM_NAME = "glycin-loaders-2.1.5-1.4.aarch64.rpm"
RPM_HASH = "158bd03034344041680ab29707bd3f06029931d28b25818eb11bd48f531305bc55a879b84c45607c0bcc68a2883d3026e0f995c44bd62dbc33e8f5745255d8d4"

RPROVIDES:${PN} += "gdk-pixbuf-loader-rsvg \
glycin-loaders \
rsvg-thumbnailer"

RDEPENDS:${PN} += "bubblewrap \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglycin-2.so.0 \
libgobject-2.0.so.0 \
libheif.so.1 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
libm.so.6 \
librsvg-2.so.2"

inherit rpm
