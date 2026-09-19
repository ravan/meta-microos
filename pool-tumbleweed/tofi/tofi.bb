SUMMARY = "Tiny dynamic menu for Wayland"
DESCRIPTION = "A simple dmenu / rofi replacement for wlroots-based Wayland \
compositors such as Sway. \
 \
When configured correctly, tofi can get on screen within a single frame."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "tofi-0.9.1-2.11.aarch64.rpm"
RPM_HASH = "c93c2ece2bc9132707622acbbf54349eb01f95f704591c1556ddaaa0577569b67bdd91e3543926c8b8660cdb6761e80a1c188e4b0d672f40ef0e7a8f9db776be"

RPROVIDES:${PN} += "tofi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
