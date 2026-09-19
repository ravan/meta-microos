SUMMARY = "Non-ABI stable API for the Qt 6 LabsAnimation library"
DESCRIPTION = "Development files for the Qt 6 LabsAnimation library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-labsanimation-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "0ebd645c4a4ef59bd7fd79c4bfc10e34a4ca9f9907d14fb7eaaf9892370a3561d212fae07748cc282263ae97c330e735c064d19c237ba32cef2458290c4c6145"

RPROVIDES:${PN} += "cmake-Qt6LabsAnimation \
cmake-Qt6LabsAnimationPrivate \
pkgconfig-Qt6LabsAnimation \
qt6-labsanimation-devel \
qt6-labsanimation-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6QmlPrivate \
cmake-Qt6QuickPrivate \
libQt6LabsAnimation6"

inherit rpm
