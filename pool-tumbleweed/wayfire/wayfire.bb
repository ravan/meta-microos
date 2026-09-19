SUMMARY = "3D wayland compositor"
DESCRIPTION = "Wayfire is a wayland compositor based on wlroots. It aims to create a customizable, extendable and lightweight environment without sacrificing its appearance. If you want to gain a better impression at what it can do, see the demo videos on youtube: https://www.youtube.com/playlist?list=PLb7YRKEhWEBUIoT-a29UoJW9mhfzjpNle"
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "wayfire-0.11.0-1.1.aarch64.rpm"
RPM_HASH = "641a8cc89e7bafe694b4a80dd8de19377a449987042ec0c98f5dd3bf2f050da2543ea32c741815579255f49677a65171e1dd55e874a3fc009f664eec2dd08bf4"

RPROVIDES:${PN} += "wayfire"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libinput.so.10 \
libjpeg.so.8 \
libm.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libudev.so.1 \
libwayland-server.so.0 \
libwf-config.so.1 \
libwf-utils.so.0 \
libwlroots-0.20.so \
libxcb.so.1 \
libxkbcommon.so.0 \
libyyjson.so.0"

inherit rpm
