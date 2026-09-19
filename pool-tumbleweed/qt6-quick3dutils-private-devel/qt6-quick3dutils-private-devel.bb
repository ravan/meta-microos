SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DUtils library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DUtils that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dutils-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "597cdbc7a30be091716ecaba6b8bd7acee54d4beff4ec35d8ae1b1fae95710fe77806a04b8ef73de9762a53b9758579618aa861c7339c6417268a6e3d10e4355"

RPROVIDES:${PN} += "cmake-Qt6Quick3DUtilsPrivate \
qt6-quick3dutils-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6Quick3DUtils \
cmake-Qt6QuickPrivate"

inherit rpm
