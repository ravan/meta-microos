SUMMARY = "Examples for the qt6-webchannel modules"
DESCRIPTION = "Examples for the qt6-webchannel modules."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webchannel-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "7d7b8fa4afb900a78398630de260b1902dbd91a2be10a0ecb66c681e0080b406e35f24fe6df1c9917520b3fcdcafe97c123aad303a4422532af5bb07cda222ac"

RPROVIDES:${PN} += "qt6-webchannel-examples"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6WebChannel.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtWebSockets"

inherit rpm
