SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libkwalletbackend5-5-5.116.0-2.9.aarch64.rpm"
RPM_HASH = "bd2ae9e5f63be93528934b2737beab6bfdea5c88e5c47d4bbc9bf5979e8838a6ee4951c48090757d6aebe3d836177dcaf4a41996496a3dae48b700645fb03dc7"

RPROVIDES:${PN} += "libkwalletbackend5-5 \
libkwalletbackend5.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcrypt.so.20 \
libgpgmepp.so.7 \
libstdc++.so.6"

inherit rpm
