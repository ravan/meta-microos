SUMMARY = "Image viewer for Sway/Wayland"
DESCRIPTION = "Swayimg is a lightweight image viewer for Wayland display servers. \
 \
In a Sway compatible mode, the viewer creates an 'overlay' above \
the currently active window, which gives the illusion that you are \
opening the image directly in a terminal window."
LICENSE = "MIT"

PV = "5.4"

RPM_NAME = "swayimg-5.4-1.3.aarch64.rpm"
RPM_HASH = "510101e3fad4825e81ca9dafcc53a9d84e1b4d285e15e018466fb8c1c3781fecc93166023d413a847dcfc581ee51c9704890af46c13be377957d576e841e810d"

RPROVIDES:${PN} += "swayimg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImath-3-2.so.30 \
libOpenEXR-3-4.so.33 \
libavif.so.16 \
libc.so.6 \
libcairo.so.2 \
libdrm.so.2 \
libexiv2.so.28 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libgobject-2.0.so.0 \
libheif.so.1 \
libjpeg.so.8 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
libluajit-5.1.so.2 \
libopenjp2.so.7 \
libpng16.so.16 \
libraw.so.25 \
librsvg-2.so.2 \
libsixel.so.1 \
libstdc++.so.6 \
libtiff.so.6 \
libwayland-client.so.0 \
libwebp.so.7 \
libwebpdemux.so.2 \
libxkbcommon.so.0"

inherit rpm
