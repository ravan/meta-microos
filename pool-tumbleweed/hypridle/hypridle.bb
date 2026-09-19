SUMMARY = "Hyprland's idle daemon"
DESCRIPTION = "Hyprland's idle daemon \
 \
* based on the ext-idle-notify-v1 wayland protocol \
* support for dbus' loginctl commands (lock / unlock / before-sleep) \
* support for dbus' inhibit (used by e.g. firefox / steam)"
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "hypridle-0.1.8-1.1.aarch64.rpm"
RPM_HASH = "b211df6f0cbf47b61f13cbe003acf9490c9428c0f9c6da15b7b2a1b0c6cea26278a56b7b284bf2fddc9b194ac6e253f41c49db808f68c5c0679ad901633ed9ec"

RPROVIDES:${PN} += "hypridle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhyprlang.so.2 \
libhyprutils.so.13 \
libm.so.6 \
libsdbus-c++.so.2 \
libstdc++.so.6 \
libwayland-client.so.0"

inherit rpm
