SUMMARY = "Terminal application"
DESCRIPTION = "Terminal application offering additional keyboard buttons useful on touch \
devices."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "qmlkonsole-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "20c4ce223a3c0cf0ffa8a59e7e0cf58f82c93fc4985c5cd3069ad3c474de25d73caab795c4a90aa01b6625a286db10bd7006cc730b39e7b9ca2ecb17ce860279"

RPROVIDES:${PN} += "qmlkonsole"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6Pty.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qmltermwidget \
qt6-declarative-imports"

inherit rpm
