SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kwalletd5-5.116.0-2.9.aarch64.rpm"
RPM_HASH = "dea833d2e3821ca8b43f5193eb5a966c8ebcdbdf29b328848353a189a30d541cedcd41a116ef140544b1ad59e776078364bf08307b71c75c4829e24707ff5725"

RPROVIDES:${PN} += "kwalletd5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.7 \
libkwalletbackend5.so.5 \
libqca-qt5.so.2 \
libstdc++.so.6"

inherit rpm
