SUMMARY = "Qt6 QmlDom static library"
DESCRIPTION = "The Qt6 QmlDom static library. \
The goal of the Dom library is to provide a nicer to use basis for the \
Qml Code model, to be used by the various QML tools, the designer and \
the new compiler."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-qmldom-devel-static-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "255b616bee20ae4986859d2721f1e42ca8141ca7977b67b8e4de73fe77f301715265a83209354749e4f2f03b50724fbafafebdbcd2f3ab90adf6dd879d7eb2d8"

RPROVIDES:${PN} += "cmake-Qt6QmlDomPrivate \
qt6-qmldom-devel-static \
qt6-qmldom-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlPrivate"

inherit rpm
