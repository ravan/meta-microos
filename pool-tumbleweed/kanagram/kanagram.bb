SUMMARY = "Anagram Game"
DESCRIPTION = "Kanagram is a letter order game."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kanagram-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "43917f683de614ad3168741f0d71831ed85f5e8382314778a296fad81e4bc696090625e553534a27de83ad723f247a285b0d4b7b796543c3b44e3a34ee4967b3"

RPROVIDES:${PN} += "kanagram \
kanagram5"

RDEPENDS:${PN} += "kdeedu-data \
ld-linux-aarch64.so.1 \
libKEduVocDocument.so.5 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6NewStuffWidgets.so.6 \
libKF6SonnetCore.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6TextToSpeech.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtMultimedia \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls"

inherit rpm
