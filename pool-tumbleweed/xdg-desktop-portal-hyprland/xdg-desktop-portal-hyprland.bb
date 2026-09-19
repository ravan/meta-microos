SUMMARY = "Extended xdg-desktop-portal backend for Hyprland"
DESCRIPTION = "A fork of xdg-desktop-portal backend for wlroots for Hyprland. It supports \
other wlroots-based Wayland compositors too with some limitations."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "xdg-desktop-portal-hyprland-1.4.1-1.2.aarch64.rpm"
RPM_HASH = "a480701fee3658b2a8f4901b276122731f727e2647a75acc63feb0254a8a9759ed566527fce3349d38fd50449c60bae452d749f75adc79c3047df80df9d89c5a"

RPROVIDES:${PN} += "xdg-desktop-portal-hyprland"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libgcc-s.so.1 \
libhyprlang.so.2 \
libhyprutils.so.13 \
libm.so.6 \
libpipewire-0.3.so.0 \
libsdbus-c++.so.2 \
libstdc++.so.6 \
libwayland-client.so.0 \
xdg-desktop-portal"

inherit rpm
