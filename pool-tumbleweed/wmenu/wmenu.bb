SUMMARY = "A dynamic menu for Sway and wlroots-based Wayland compositors"
DESCRIPTION = "An dynamic menu for Sway and wlroots based Wayland compositors (requires \
wlr_layer_shell_v1 support)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "wmenu-0.2.0-1.6.aarch64.rpm"
RPM_HASH = "e5c49bcf2537502c4f1e1dfd206eb8fc27f590961f41e5b2ad4963eac736c74a054a9df4f1bb1132892dee4bbab762b557a79786a7036132cdbff6de4ecfb097"

RPROVIDES:${PN} += "wmenu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
