SUMMARY = "Mind-mapping app"
DESCRIPTION = "A program to create, develop, visualize, organize and manage ideas."
LICENSE = "GPL-3.0-only"

PV = "2.0.9"

RPM_NAME = "minder-2.0.9-1.3.aarch64.rpm"
RPM_HASH = "a3847c5c4888d01470c2d427325b31cdb6e9b6c76c050ec1bc2ac97ad8bf1375025da9b164aaba1199b450b313264346556a6ad690ed2605c547e1ac2ee1e217"

RPROVIDES:${PN} += "minder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwebp.so.7 \
libxml2.so.16"

inherit rpm
