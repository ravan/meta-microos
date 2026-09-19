SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kwalletd6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "245dd7f3cd179a25ed95ceecdd142f434fc1af682194814cd72f539b9db61b08ae11a9f3ed1c420739788f8043ae694881224f756e8e91a09cc9e05359322057"

RPROVIDES:${PN} += "kwalletd5 \
kwalletd6"

RDEPENDS:${PN} += "kf6-kwallet \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6Notifications.so.6 \
libKF6Wallet.so.6 \
libKF6WalletBackend.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgmepp.so.7 \
libqca-qt6.so.2 \
libsecret-1.so.0 \
libstdc++.so.6"

inherit rpm
