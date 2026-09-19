SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Wallet6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "6b7611bd9570fa1f7696048cf3e04250ae11f24443c8db6cb760f8eba00e6ba4740105b5f8a1bf0de369af9cdeb82fb003adc3441e3c84b14d8e1f1993b5dd12"

RPROVIDES:${PN} += "libKF6Wallet.so.6 \
libKF6Wallet6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kwallet \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
