SUMMARY = "Examples for the qt6-lottie modules"
DESCRIPTION = "Examples for the qt6-lottie modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-lottie-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "fa8944abfab0680d5dbe90b5e00c87f4c8f2a9507fa90945c408bdb7a2b654c09cb9e7607030414bab0ea037e9033528cdf37e0110c942031ed43b6ab22dc7d7"

RPROVIDES:${PN} += "qt6-lottie-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-Qt.labs.folderlistmodel \
qt6qmlimport-Qt.labs.lottieqt \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts"

inherit rpm
