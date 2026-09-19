SUMMARY = "Qt 6 Multimedia libraries"
DESCRIPTION = "Qt Multimedia is a module that provides a set of QML types and C++ \
classes to handle multimedia content. It also provides APIs to access \
the camera and radio functionality."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-multimedia-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5398a48745aed837fbd34521ee92b932bd2327c9b19848281bde63010dc2314044f87907564f8ae701214e95458f59b836033eb2b16c15826a8374047f73e3c3"

RPROVIDES:${PN} += "libffmpegmediaplugin.so \
libgstreamermediaplugin.so \
qt6-multimedia"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6OpenGL.so.6 \
libQt6Quick.so.6 \
libX11.so.6 \
libXext.so.6 \
libXrandr.so.2 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstphotography-1.0.so.0 \
libgstplay-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
libpulse.so.0 \
libstdc++.so.6 \
libswresample.so.6 \
libswscale.so.9 \
libva.so.2"

inherit rpm
