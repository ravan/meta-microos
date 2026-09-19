SUMMARY = "Non-ABI stable API for the Qt 6 LabsSharedImage library"
DESCRIPTION = "Development files for the Qt 6 LabsSharedImage library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-labssharedimage-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "92f808c8ec7620346a827a9116e7f71b26e6183e78db916de6536c65b15a7fe3d101fb8e06ac1e01cb54bd7a31cc48bf2b4f1206e939d8fdd4a8bdd5cac3765a"

RPROVIDES:${PN} += "cmake-Qt6LabsSharedImage \
cmake-Qt6LabsSharedImagePrivate \
pkgconfig-Qt6LabsSharedImage \
qt6-labssharedimage-devel \
qt6-labssharedimage-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6QuickPrivate \
libQt6LabsSharedImage6"

inherit rpm
