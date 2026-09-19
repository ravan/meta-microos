SUMMARY = "Dynamic tiling Wayland compositor"
DESCRIPTION = "Hyprland is a dynamic tiling Wayland compositor based on wlroots \
that doesn't sacrifice on its looks. \
 \
It supports multiple layouts, fancy effects, has a very flexible IPC \
model allowing for a lot of customization, and more."
LICENSE = "BSD-3-Clause"

PV = "0.56.2"

RPM_NAME = "hyprland-0.56.2-1.2.aarch64.rpm"
RPM_HASH = "9eb659441551be0875ca03ed8e9193437719e3ed618818317da04d4ca9e403cf64acd1fa3b32336eaffc2ba6647fa8839f41f177bc3bf29432e7b788a4bbd95f"

RPROVIDES:${PN} += "hyprland"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libXcursor.so.1 \
libaquamarine.so.14 \
libc.so.6 \
libcairo.so.2 \
libdrm.so.2 \
libeis.so.1 \
libgbm.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglslang-default-resource-limits.so.16 \
libglslang.so.16 \
libgobject-2.0.so.0 \
libhyprcursor.so.0 \
libhyprgraphics.so.4 \
libhyprlang.so.2 \
libhyprutils.so.13 \
libhyprwire.so.3 \
libinput.so.10 \
liblcms2.so.2 \
liblua5.5.so.5 \
libm.so.6 \
libmuparser.so.2.3.5 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpixman-1.so.0 \
libre2.so.11 \
libreadline.so.8 \
libstdc++.so.6 \
libuuid.so.1 \
libwayland-server.so.0 \
libxcb-composite.so.0 \
libxcb-errors.so.0 \
libxcb-icccm.so.4 \
libxcb-render.so.0 \
libxcb-res.so.0 \
libxcb-xfixes.so.0 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
