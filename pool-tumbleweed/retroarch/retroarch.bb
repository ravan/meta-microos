SUMMARY = "Emulator frontend"
DESCRIPTION = "RetroArch is a modular multi-system emulator system that is designed to be \
fast, lightweight, and portable. It has features few other emulators frontends \
have, such as real-time rewinding and game-aware shading."
LICENSE = "GPL-3.0-only"

PV = "1.22.1"

RPM_NAME = "retroarch-1.22.1-2.8.aarch64.rpm"
RPM_HASH = "747553d4c4b019cc2a6f39d813841da2f8fcbbd27b1b5a80fb623d80807dd5393eef2a395ad7c3f36498a5e52a930c5ec11dc683ace5f5b6f9a06d43ba459471"

RPROVIDES:${PN} += "config-retroarch \
retroarch"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libSDL2-2.0.so.0 \
libX11-xcb.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libXv.so.1 \
libXxf86vm.so.1 \
libasound.so.2 \
libass.so.9 \
libavcodec.so.62 \
libavdevice.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libdbus-1.so.3 \
libdrm.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libjack.so.0 \
liblzma.so.5 \
libm.so.6 \
libopenal.so.1 \
libpipewire-0.3.so.0 \
libpulse.so.0 \
libstdc++.so.6 \
libswresample.so.6 \
libswscale.so.9 \
libudev.so.1 \
libv4l2.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libxkbcommon.so.0"

inherit rpm
