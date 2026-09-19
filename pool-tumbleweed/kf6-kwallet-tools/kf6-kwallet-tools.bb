SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kwallet-tools-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "abf243ebfa70cb462e211242c65dd38a4bceea275a02a1492f8b0eff93c5410601160b25b42e4657b8bfb15a028836013c7476e497c3b648c4dc4fc89659a611"

RPROVIDES:${PN} += "kf6-kwallet-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6Wallet.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
