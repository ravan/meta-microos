SUMMARY = "Non-ABI stable API for the Qt6 WaylandCompositor library"
DESCRIPTION = "This package provides private headers of libQt6WaylandCompositor that do not \
have any ABI or API guarantees."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-waylandcompositor-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "201dd13d9a290a1297aa655638088bad278e6ec05f7bb734ac0bc0b08b5c9bd1898ee991fd43ebd5932169dad43d241420c7c3f5f192847a0aa3a8c18170a087"

RPROVIDES:${PN} += "cmake-Qt6WaylandCompositorIviapplicationPrivate \
cmake-Qt6WaylandCompositorPresentationTimePrivate \
cmake-Qt6WaylandCompositorPrivate \
cmake-Qt6WaylandCompositorWLShellPrivate \
cmake-Qt6WaylandCompositorXdgShellPrivate \
qt6-waylandcompositor-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6QmlPrivate \
cmake-Qt6QuickPrivate \
cmake-Qt6WaylandCompositor"

inherit rpm
