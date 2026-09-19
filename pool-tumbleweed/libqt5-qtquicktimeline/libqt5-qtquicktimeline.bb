SUMMARY = "Qt 5 Quick Timeline Addon"
DESCRIPTION = "The Qt Quick Timeline module provides QML types to use timelines and keyframes \
to animate Qt Quick user interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtquicktimeline-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "3b3a8b5ae7225b74a79ee625715555b5a1ab71ecc688878c47cf28c89b7086481ad607523b2e397337f080c14d048ab29bd7dd166d35c993f35914678ab85601"

RPROVIDES:${PN} += "libqt5-qtquicktimeline \
libqtquicktimelineplugin.so \
qt5qmlimport-QtQuick.Timeline.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
