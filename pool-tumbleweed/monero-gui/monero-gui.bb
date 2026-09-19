SUMMARY = "The official GUI app for the Monero cryptocurrency"
DESCRIPTION = "The official Qt-based GUI wallet app for the privacy-focused Monero cryptocurrency"
LICENSE = "BSD-3-Clause"

PV = "0.18.5.2"

RPM_NAME = "monero-gui-0.18.5.2-1.1.aarch64.rpm"
RPM_HASH = "d5542fb7396acd61dd069242cedb2c381d03d032cbac088aa3f3dc4362f09f12a09f7980e1cc237a28a248cc446049767a8365593af051b1059939ee797d520c"

RPROVIDES:${PN} += "monero-gui"

RDEPENDS:${PN} += "graphviz \
gtk3-tools \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickTest.so.5 \
libQt5Widgets.so.5 \
libboost-chrono.so.1.91.0 \
libboost-filesystem.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libboost-serialization.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libhidapi-libusb.so.0 \
libm.so.6 \
libqt5-qtquickcontrols2 \
libqt5-qtxmlpatterns-imports \
libsodium.so.26 \
libssl.so.3 \
libstdc++.so.6 \
libunbound.so.8 \
monero-utils \
monerod"

inherit rpm
