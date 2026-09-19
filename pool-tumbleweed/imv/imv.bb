SUMMARY = "Image viewer for X11/Wayland"
DESCRIPTION = "imv is a command line image viewer intended for use with tiling window managers."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.0.1"

RPM_NAME = "imv-5.0.1-1.7.aarch64.rpm"
RPM_HASH = "dd0fc5771cfd1bcef394631103840325e05366fb4219010e935abc283326c9e1b8bb154a2070aaf4121d004aa2a880bfddb2733dcda74d91edcf748e1f6461d3"

RPROVIDES:${PN} += "imv"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgobject-2.0.so.0 \
libheif.so.1 \
libicuuc.so.78 \
libinih.so.0 \
libjxl.so.0.11 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
librsvg-2.so.2 \
libtiff.so.6 \
libturbojpeg.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libwebpdecoder.so.3 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0"

inherit rpm
