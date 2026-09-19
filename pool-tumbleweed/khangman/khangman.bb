SUMMARY = "Hangman Game"
DESCRIPTION = "Classical hangman game by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "khangman-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "04b103eb86c4485242eb021e7a5d0e58845be4a15a0bc03cd3b6afaeb6e8f6a954d9945382ca1dfd00d1ab71dff67aa84cf78ca44fc15ced8b69fc90df7786da"

RPROVIDES:${PN} += "khangman \
khangman5"

RDEPENDS:${PN} += "kdeedu-data \
ld-linux-aarch64.so.1 \
libKEduVocDocument.so.5 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6NewStuffCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
