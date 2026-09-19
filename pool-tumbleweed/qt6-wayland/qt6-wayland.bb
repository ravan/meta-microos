SUMMARY = "Qt 6 Wayland plugins"
DESCRIPTION = "Qt 6 wayland plugins."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-wayland-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "cf783ce032a8e06ff0e8b62ba34f12704db29cbc3a981b496bbedb57a39e51318bf0fd336a5543ed1c4d44f523d487f433a6cb72a9a396a61db68ef66a35a62f"

RPROVIDES:${PN} += "libbradient.so \
libdmabuf-server.so \
libdrm-egl-server.so \
libfullscreen-shell-v1.so \
libqt-plugin-wayland-egl.so \
libshm-emulation-server.so \
libvulkan-server.so \
libwl-shell-plugin.so \
libxdg-shell.so \
qt6-wayland"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6WaylandClient.so.6 \
libQt6WlShellIntegration.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-egl.so.1"

inherit rpm
