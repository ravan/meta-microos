SUMMARY = "Qt 6 LabsStyleKit library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsStyleKit library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-labsstylekit-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "8b71253c28a8d90e0adf643ab4116354216346ec2205ac6f60fa7e441c650b12db887d64586b3260e1a984e1f0c906464adf74ad44412e451fda26adc781702b"

RPROVIDES:${PN} += "cmake-Qt6LabsStyleKit \
cmake-Qt6LabsStyleKitImpl \
cmake-Qt6LabsStyleKitImplPrivate \
cmake-Qt6LabsStyleKitPrivate \
pkgconfig-Qt6LabsStyleKit \
pkgconfig-Qt6LabsStyleKitImpl \
qt6-labsstylekit-private-devel \
qt6-quickstylekit-private-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6GuiPrivate \
cmake-Qt6Qml \
cmake-Qt6QuickPrivate \
libQt6LabsStyleKit6"

inherit rpm
