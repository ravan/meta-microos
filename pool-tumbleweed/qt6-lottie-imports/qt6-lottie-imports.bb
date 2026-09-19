SUMMARY = "Qt 6 Lottie QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Lottie module."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-lottie-imports-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "1738dbc847bae6d646d69bcdc99efb27ba80cd4f28db91823f413690153b4f58adcb882996a73f07139bfa7801b4c2c7a46fb486ea17daf36c7a7fd3c121ad14"

RPROVIDES:${PN} += "liblottieplugin.so \
liblottievectorimagehelpersplugin.so \
qt6-lottie-imports \
qt6qmlimport-Qt.labs.lottieqt \
qt6qmlimport-Qt.labs.lottieqt.1 \
qt6qmlimport-Qt.labs.lottieqt.2 \
qt6qmlimport-Qt.labs.lottieqt.6 \
qt6qmlimport-Qt.labs.lottieqt.VectorImageHelpers \
qt6qmlimport-Qt.labs.lottieqt.VectorImageHelpers.2 \
qt6qmlimport-Qt.labs.lottieqt.VectorImageHelpers.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Lottie.so.6 \
libQt6LottieVectorImageHelpers.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
