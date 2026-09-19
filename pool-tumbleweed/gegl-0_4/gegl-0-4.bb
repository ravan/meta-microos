SUMMARY = "Generic Graphics Library"
DESCRIPTION = "GEGL provides infrastructure to do demand based cached non destructive \
image editing on larger than RAM buffers. Through babl, it provides \
support for a wide range of color models and pixel storage formats for \
input and output."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.4.72"

RPM_NAME = "gegl-0_4-0.4.72-1.1.aarch64.rpm"
RPM_HASH = "924826616e7d34054760013dedf5fd182dcc06ef951fd09d1f00470acfab57c77bf5b2262084ec6dec0eaf7ad57cffc43ac8dc20b20e014e7fc4f91a438cd57c"

RPROVIDES:${PN} += "gegl-0-4 \
libgegl-npd-0.4.so \
libgegl-sc-0.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenEXR-3-4.so.33 \
libSDL2-2.0.so.0 \
libSDL3.so.0 \
libbabl-0.1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgegl-0.4.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libjpeg.so.8 \
libjson-glib-1.0.so.0 \
liblcms2.so.2 \
liblensfun.so.1 \
libluajit-5.1.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libpoppler-glib.so.8 \
libraw.so.25 \
librsvg-2.so.2 \
libstdc++.so.6 \
libtiff.so.6 \
libumfpack.so.6 \
libwebp.so.7"

inherit rpm
