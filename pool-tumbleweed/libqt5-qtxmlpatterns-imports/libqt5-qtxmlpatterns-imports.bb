SUMMARY = "QML imports for the XmlPatterns module"
DESCRIPTION = "This package provides the QtQuick.XmlListModel QML import."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtxmlpatterns-imports-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "541fcfbfa63d6d74f7b201f59ab5cab65d24a2b1713dd16f751dda87e08e0948912d588e06222239a253b6d9e701304353170e77a108ef204f412e35273c38ad"

RPROVIDES:${PN} += "libqmlxmllistmodelplugin.so \
libqt5-qtxmlpatterns-imports \
qt5qmlimport-QtQuick.XmlListModel.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5XmlPatterns.so.5 \
libQt5XmlPatterns5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
