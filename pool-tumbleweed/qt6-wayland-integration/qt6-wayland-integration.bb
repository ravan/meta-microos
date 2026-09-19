SUMMARY = "Qt 6 Wayland integration"
DESCRIPTION = "Qt 6 Wayland integration plugins."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-wayland-integration-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "0416b42df1c26f72374ebe726733dacaf3c5916151f565d12b0326b6cc6591e5fdc383f6f05ec585f8d1133a43cc4727b41dea7b5fe783c8029ed601af779425"

RPROVIDES:${PN} += "libivi-shell.so \
libqt-shell.so \
libqt-wayland-compositor-dmabuf-server-buffer.so \
libqt-wayland-compositor-drm-egl-server-buffer.so \
libqt-wayland-compositor-linux-dmabuf-unstable-v1.so \
libqt-wayland-compositor-shm-emulation-server.so \
libqt-wayland-compositor-vulkan-server.so \
libqt-wayland-compositor-wayland-egl.so \
libqt-wayland-compositor-wayland-eglstream-controller.so \
qt6-wayland-integration"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6WaylandClient.so.6 \
libQt6WaylandCompositor.so.6 \
libQt6WaylandEglCompositorHwIntegration.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0"

inherit rpm
