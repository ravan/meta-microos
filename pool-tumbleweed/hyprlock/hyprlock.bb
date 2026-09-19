SUMMARY = "Hyprland's screen locking utility"
DESCRIPTION = "Hyprland's simple, yet multi-threaded and GPU-accelerated screen locking utility. \
 \
* uses the secure ext-session-lock protocol \
* full support for fractional-scale \
* fully GPU accelerated \
* multi-threaded resource acquisition for no hitches"
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "hyprlock-0.9.6-1.1.aarch64.rpm"
RPM_HASH = "1bef4e8e2b69c3df7ec4dd3765138781a1ce3e30f324febddec4a2a5b8f7bf1f54474d863a38a9fdc82d456b224564e725563efba162b1198570f95442c7a00b"

RPROVIDES:${PN} += "hyprlock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libcairo.so.2 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libhyprgraphics.so.4 \
libhyprlang.so.2 \
libhyprutils.so.13 \
libm.so.6 \
libpam.so.0 \
libsdbus-c++.so.2 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libxkbcommon.so.0"

inherit rpm
