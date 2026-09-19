SUMMARY = "Terminal image viewer"
DESCRIPTION = "A user-friendly terminal image viewer that uses graphic capabilities of \
terminals (Sixel, Kitty or iterm2), or 24-Bit color capabilities and unicode \
character blocks if these are not available."
LICENSE = "GPL-2.0-only"

PV = "1.6.3"

RPM_NAME = "timg-1.6.3-1.10.aarch64.rpm"
RPM_HASH = "5541d435652a991bb22262f4c32bf9c8e82786eb8b4eccd2df22beb0a4208b48a1f61e97d43bf6af68463a313960707ac6e69a86cc58ae66faed46a6db9c76fb"

RPROVIDES:${PN} += "timg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGraphicsMagick++-Q16.so.12 \
libGraphicsMagick-Q16.so.3 \
libavcodec.so.62 \
libavdevice.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcairo.so.2 \
libdeflate.so.0 \
libexif.so.12 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libm.so.6 \
libpoppler-glib.so.8 \
librsvg-2.so.2 \
libsixel.so.1 \
libstdc++.so.6 \
libswscale.so.9 \
libturbojpeg.so.0"

inherit rpm
