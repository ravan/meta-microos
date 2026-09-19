SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Wallet5-5.116.0-2.9.aarch64.rpm"
RPM_HASH = "d9945fdb29e7f99de4a1a8085719a9d06b4c2613c0789c86848d484a320f6601c937d9bfcbea0fc2faaaa51f606969bb4a3cca887438a8311d885d4edc2d7c74"

RPROVIDES:${PN} += "libKF5Wallet.so.5 \
libKF5Wallet5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
