SUMMARY = "Qt 6 WaylandCompositor library"
DESCRIPTION = "The Qt 6 WaylandCompositor library."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6WaylandCompositor6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "dabcd2a612d3d693b8fa439121f7b881d3f7a3fd18d019800a02aaac2b9519159fd1162e1a9dacf96637bf44c6da9a4e9221b54ba854fda06ca74ef9518a8593"

RPROVIDES:${PN} += "libQt6WaylandCompositor.so.6 \
libQt6WaylandCompositor6 \
libQt6WaylandCompositorIviapplication.so.6 \
libQt6WaylandCompositorPresentationTime.so.6 \
libQt6WaylandCompositorWLShell.so.6 \
libQt6WaylandCompositorXdgShell.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-server.so.0 \
libxkbcommon.so.0"

inherit rpm
