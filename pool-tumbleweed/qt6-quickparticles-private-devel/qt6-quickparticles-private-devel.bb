SUMMARY = "Qt 6 QuickParticles library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickParticles library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickparticles-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "3633977ff15b22cc8ccc9e9e4ce867eab563dbaf568de82e7cff7db28117e2aa87e62f5d80f3293e89f82ecf310cd4cca35ba7197e4370335753c00062b1a14e"

RPROVIDES:${PN} += "cmake-Qt6QuickParticlesPrivate \
qt6-quickparticles-devel \
qt6-quickparticles-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6QmlPrivate \
cmake-Qt6QuickPrivate \
libQt6QuickParticles6"

inherit rpm
