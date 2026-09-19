SUMMARY = "Lightweight Gtk+ based image viewer"
DESCRIPTION = "Geeqie is a lightweight image viewer for Linux, BSDs and compatibles."
LICENSE = "GPL-2.0-or-later"

PV = "3.1"

RPM_NAME = "geeqie-3.1-1.1.aarch64.rpm"
RPM_HASH = "0c489037cf5ec27a46ee25cc7faf6fa0ae24023114e6d1213506036da93f8536a335f4458f281ff294ad17ed278ad261e60c115161d35df0a5efaf4aec8e9e48"

RPROVIDES:${PN} += "geeqie"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libImath-3-2.so.30 \
libOpenEXR-3-4.so.33 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libcfitsio.so.10 \
libdjvulibre.so.21 \
libexiv2.so.28 \
libffmpegthumbnailer.so.4 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libheif.so.1 \
libjpeg.so.8 \
libjxl.so.0.11 \
liblcms2.so.2 \
liblua5.4.so.5 \
libm.so.6 \
libopenjp2.so.7 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpoppler-glib.so.8 \
libraw.so.25 \
libshumate-1.0.so.1 \
libspelling-1.so.2 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7"

inherit rpm
