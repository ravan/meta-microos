SUMMARY = "Qt5 multimedia examples"
DESCRIPTION = "Examples for the libqt5-qtmultimedia module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde2"

RPM_NAME = "libqt5-qtmultimedia-examples-5.15.19+kde2-1.2.aarch64.rpm"
RPM_HASH = "6c5240bb60a91b23fa12d4af28b0a2730c28725ef319536cb188eba1f26a362ba5ddfd7c702b6a9ca82452dfbdab910fec9f5f4b3cc1b9d51d18d7316bc22261"

RPROVIDES:${PN} += "libqt5-qtmultimedia-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5MultimediaWidgets.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.folderlistmodel.2 \
qt5qmlimport-QtAudioEngine.1 \
qt5qmlimport-QtMultimedia.5 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
