SUMMARY = "Free and open source software for video recording and live streaming"
DESCRIPTION = "OBS Studio is software designed for capturing, compositing, encoding, recording, and streaming video content, efficiently."
LICENSE = "GPL-2.0-or-later"

PV = "32.2.1"

RPM_NAME = "obs-studio-32.2.1-2.1.aarch64.rpm"
RPM_HASH = "6f46db3fb695b5b3239e7bfe2373999aa6261ea44cce152567c52a14ebb7ee6ee72bd8ce51290574a0537c1b9559d309a1577fa391788ba4b876a6e46d124057"

RPROVIDES:${PN} += "libobs-frontend-api.so.30 \
libobs-opengl.so.30 \
libobs-scripting.so.30 \
libobs.so.30 \
obs-studio"

RDEPENDS:${PN} += "/usr/bin/sh \
libEGL.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libX11-xcb.so.1 \
libX11.so.6 \
libasound.so.2 \
libavcodec.so.62 \
libavdevice.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcurl.so.4 \
libdatachannel.so.0.24 \
libdrm.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libjack.so.0 \
libjansson.so.4 \
libluajit-5.1.so.2 \
libm.so.6 \
libmbedcrypto.so.7 \
libmbedtls.so.14 \
libmbedx509.so.1 \
libpci.so.3 \
libpipewire-0.3.so.0 \
libpulse.so.0 \
libpython3.13.so.1.0 \
librist.so.4 \
librnnoise.so.0 \
libsndio.so.7 \
libspeexdsp.so.1 \
libsrt.so.1.5 \
libstdc++.so.6 \
libswresample.so.6 \
libswscale.so.9 \
libudev.so.1 \
libuuid.so.1 \
libv4l2.so.0 \
libva-drm.so.2 \
libva.so.2 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libxcb-composite.so.0 \
libxcb-randr.so.0 \
libxcb-shm.so.0 \
libxcb-xfixes.so.0 \
libxcb-xinerama.so.0 \
libxcb-xinput.so.0 \
libxcb.so.1 \
libxkbcommon.so.0 \
libz.so.1"

inherit rpm
