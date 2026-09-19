SUMMARY = "Terminal emulator which mimics old screens"
DESCRIPTION = "cool-retro-term is a terminal emulator which tries to mimic the look and feel \
of the old cathode tube screens. It has been designed to be eye-candy, \
customizable, and reasonably lightweight."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0b2"

RPM_NAME = "cool-retro-term-2.0.0b2-1.2.aarch64.rpm"
RPM_HASH = "8b3ad89b8cc33e8a47d56d39981959cb9254db144fb1163c2ea7e48dc45131608f43e9eee2ece59a4b9460bce5ea7c3442b14a71a7aca6c53497966398c41a80"

RPROVIDES:${PN} += "cool-retro-term \
libqmltermwidget.so \
qt6qmlimport-QMLTermWidget \
qt6qmlimport-QMLTermWidget.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2-6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6-qt5compat-imports \
qt6-sql-sqlite \
qt6qmlimport-QMLTermWidget.2 \
qt6qmlimport-QtQuick.2"

inherit rpm
