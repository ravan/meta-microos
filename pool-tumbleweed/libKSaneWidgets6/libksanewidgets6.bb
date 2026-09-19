SUMMARY = "KDE scan library"
DESCRIPTION = "The KDE scanner library provides an API and widgets for using \
scanners and other imaging devices supported by SANE."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "libKSaneWidgets6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "70e81c4807adfc289ebca2d9b16a047c4449baa030443ac73029b0b0453bd7323ce16064ead21734074fbf14a62deb911b8dc9fd391182fe8db588287bfa4895"

RPROVIDES:${PN} += "libKSaneWidgets6 \
libKSaneWidgets6.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6I18n.so.6 \
libKF6TextWidgets.so.6 \
libKF6Wallet.so.6 \
libKF6WidgetsAddons.so.6 \
libKSaneCore6.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libksane-icons \
libm.so.6 \
libstdc++.so.6"

inherit rpm
