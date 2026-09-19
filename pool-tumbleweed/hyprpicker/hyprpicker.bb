SUMMARY = "A wlroots-compatible Wayland color picker"
DESCRIPTION = "A wlroots-compatible Wayland color picker with magnifying lens. It \
supports a few different output forms, e.g. RGB, CMYK, HSL, HSV."
LICENSE = "BSD-3-Clause"

PV = "0.4.7"

RPM_NAME = "hyprpicker-0.4.7-1.2.aarch64.rpm"
RPM_HASH = "800adb357187a584c06d8e954d88458ff7dfdaa48c68f43079bc9fb9ab8d4bc59bf6f54b49eda7481a2f7e26918dccb1028cbebdbdec039ec18c9e88fd3e9865"

RPROVIDES:${PN} += "hyprpicker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libhyprutils.so.13 \
libm.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
