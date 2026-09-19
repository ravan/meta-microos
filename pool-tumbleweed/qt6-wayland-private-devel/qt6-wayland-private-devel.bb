SUMMARY = "Qt6 wayland unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-wayland development packages that do not \
have any ABI or API guarantees."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-or-later) & GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-wayland-private-devel-6.11.2-1.1.noarch.rpm"
RPM_HASH = "76987e9b29b0b38a9a8c524a30a9bfe56c3a12302115d41573713201592d3e5640a12495fae99d2cfb5312c3b41dc30fe457817867f7456c9a11097ec40dfe0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-wayland-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WaylandCompositorPrivate \
cmake-Qt6WaylandEglCompositorHwIntegrationPrivate"

inherit rpm
