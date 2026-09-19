SUMMARY = "A GPU-based terminal emulator"
DESCRIPTION = "A terminal emulator that uses OpenGL for rendering. \
Supports terminal features like: graphics, Unicode, \
true-color, OpenType ligatures, mouse protocol, focus tracking, \
bracketed paste and so on, and which can be controlled by scripts."
LICENSE = "GPL-3.0-only"

PV = "0.48.2"

RPM_NAME = "kitty-0.48.2-1.1.aarch64.rpm"
RPM_HASH = "051ae85c626668f70cbeeb28d04702380786f97b8ae3fcf625899f0e52890ec43417d165659e350482803ae7190925696cd609b56f5dbc5bb5ed12c3cb9b6e26"

RPROVIDES:${PN} += "kitty"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libdbus-1.so.3 \
libfreetype.so.6 \
libharfbuzz.so.0 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libpython3.13.so.1.0 \
libwayland-client.so.0 \
libwayland-cursor0 \
libwayland-egl1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libxxhash.so.0 \
libz.so.1"

inherit rpm
