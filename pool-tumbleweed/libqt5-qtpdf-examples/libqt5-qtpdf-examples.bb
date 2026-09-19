SUMMARY = "Qt5 PDF examples"
DESCRIPTION = "Examples for the libqt5-qtpdf module."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.19"

RPM_NAME = "libqt5-qtpdf-examples-5.15.19-3.3.aarch64.rpm"
RPM_HASH = "9f8f45cca4a1b50ba671ffd73634d8b7209b8980e6bdb561078bb6901af94b29bcd2e794c81a512e1a767838bc806e623058e21d18a085dcb86dd959b975dc0f"

RPROVIDES:${PN} += "libqt5-qtpdf-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Pdf.so.5 \
libQt5PdfWidgets.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.animation.1 \
qt5qmlimport-Qt.labs.platform.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Pdf.5 \
qt5qmlimport-QtQuick.Shapes.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
