SUMMARY = "Wallpaper application for layer-shell Wayland compositors"
DESCRIPTION = "Wbg is a wallpaper setter for Wayland compositors that implement the \
layer-shell protocol. \
 \
It takes a single argument, the image filename, which is displayed \
scaled-to-fit on all monitors."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "wbg-1.3.0-1.8.aarch64.rpm"
RPM_HASH = "0bc27bbfb35e84c5b559b5e4b682ea98ef0c8dea3955151a8ee41b8a295a8ecd0e9ccaaf9d6ea968da9eccad28aaeef1962df717eb7c86b67668c3e52559687d"

RPROVIDES:${PN} += "wbg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
libm.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libwayland-client.so.0 \
libwebp.so.7"

inherit rpm
