SUMMARY = "Non-ABI stable API for the Qt 6 Widgets library"
DESCRIPTION = "This package provides private headers of libQt6Widgets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-widgets-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "1661f0e47a21f4a5298d2bf78064321be038b7fb8719f254a5d0e75b28f43e8b0664e3b8d89bcd758d9db92e7905eed85ed220f380032fd51a9373e0974546ec"

RPROVIDES:${PN} += "cmake-Qt6WidgetsPrivate \
qt6-widgets-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6GuiPrivate \
cmake-Qt6Widgets"

inherit rpm
