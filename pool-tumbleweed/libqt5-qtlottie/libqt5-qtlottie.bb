SUMMARY = "Qt 5 Quick Lottie Addon"
DESCRIPTION = "This package provides a QML module for Qt 5 which allows playing of BodyMovin \
files from QML."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtlottie-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "9ef8277c270a9842358d4632749f02856222d4d16f2b2cacb27c9e888ebee60c04a1f2232dedeef011d67b743b5e9738d66ee49c3f0024b5f1609034569d6699"

RPROVIDES:${PN} += "liblottieqtplugin.so \
libqt5-qtlottie \
qt5qmlimport-Qt.labs.lottieqt.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Bodymovin.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
