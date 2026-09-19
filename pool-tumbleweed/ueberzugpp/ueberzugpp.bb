SUMMARY = "Utility to render images in terminals"
DESCRIPTION = "Überzug++ is a C++ command line utility which allows to draw images \
on terminals by using child windows or using sixel on supported \
terminals. (This is a drop-in replacement for the now defunct \
ueberzug project.) \
 \
Advantages over w3mimgdisplay and ueberzug: \
 \
- support for wayland (sway only) \
- no race conditions as a new window is created to display images \
- 'expose' events will be processed, so that images will be \
  redrawn when switching workspaces \
- tmux support on X11 \
- terminals without the WINDOWID environment variable are supported \
- chars are used as position and size unit \
- A lot of image formats are supported (through opencv and libvips) \
- GIF and animated WEBP support on X11 and Sixel \
- Resized images are cached for faster viewing"
LICENSE = "GPL-3.0"

PV = "2.9.8+git20251027.c1c76e3"

RPM_NAME = "ueberzugpp-2.9.8+git20251027.c1c76e3-1.6.aarch64.rpm"
RPM_HASH = "4f12ed40d4307ef1fbd40a0e2c6fcf11c84f4ca99998c3a84e84d02bdd94d102495a584c4cc753db572e48c30afc67388db295396c0ae2c48407fc1ea1ba7a2a"

RPROVIDES:${PN} += "ueberzugpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchafa.so.0 \
libcrypto.so.3 \
libfmt.so.12 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libopencv-core.so.413 \
libopencv-imgcodecs.so.413 \
libopencv-imgproc.so.413 \
libopencv-videoio.so.413 \
libsixel.so.1 \
libspdlog.so.1.17 \
libstdc++.so.6 \
libtbb.so.12 \
libvips-cpp.so.42 \
libvips.so.42 \
libxcb-image.so.0 \
libxcb-res.so.0 \
libxcb.so.1"

inherit rpm
