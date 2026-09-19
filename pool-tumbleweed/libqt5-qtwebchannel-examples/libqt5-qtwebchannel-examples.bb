SUMMARY = "Qt5 WebChannel examples"
DESCRIPTION = "Examples for the libqt5-qtwebchannel module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde3"

RPM_NAME = "libqt5-qtwebchannel-examples-5.15.19+kde3-1.2.aarch64.rpm"
RPM_HASH = "b22732e9652d9dffc4950bd77494c80d2beece25fb00e0626f8153ce52683aee66e513c5c8649890bf52242bfc06bfbec6ae19a96965b418e4ad736ae5ca47b2"

RPROVIDES:${PN} += "libqt5-qtwebchannel-examples"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebChannel.so.5 \
libQt5WebSockets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.WebSockets.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
