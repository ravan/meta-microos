SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6WalletBackend6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "5ca777192a09aa0cbc3ca4fdf5b68679ca0b9234f7f1a923c8c3464cdfe12c0cdd3accd8d6d35920c03e90d30cd27d394217ff8205477342c9b75a7a6e930213"

RPROVIDES:${PN} += "libKF6WalletBackend.so.6 \
libKF6WalletBackend6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6I18n.so.6 \
libKF6Notifications.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libgcrypt.so.20 \
libgpgmepp.so.7 \
libstdc++.so.6"

inherit rpm
