SUMMARY = "Development files for the Qt6 WaylandCompositor library"
DESCRIPTION = "Development files for the Qt6 WaylandCompositor library."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-waylandcompositor-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f75210dbdc10f80b16b0b1a800d70b38c3d4af1a47173c74f7a8a48a29895816d2ac4e7acf65ae1670e55dee46afb8d553c8a06e6c68995b1115ffeb1f989339"

RPROVIDES:${PN} += "cmake-Qt6WaylandCompositor \
cmake-Qt6WaylandCompositorIviapplication \
cmake-Qt6WaylandCompositorPresentationTime \
cmake-Qt6WaylandCompositorWLShell \
cmake-Qt6WaylandCompositorXdgShell \
pkgconfig-Qt6WaylandCompositor \
pkgconfig-Qt6WaylandCompositorIviapplication \
pkgconfig-Qt6WaylandCompositorPresentationTime \
pkgconfig-Qt6WaylandCompositorWLShell \
pkgconfig-Qt6WaylandCompositorXdgShell \
qt6-waylandcompositor-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6OpenGL \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6WaylandGlobalPrivate \
libQt6WaylandCompositor6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6OpenGL \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick"

inherit rpm
