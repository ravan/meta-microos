SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kwallet-tools-5.116.0-2.9.aarch64.rpm"
RPM_HASH = "cd6fdb7bba3f3a53b3587c1eaaf84e8372dd2fb9c60ef165ee78617b63b64c360504abcc8eda51bff31edaf64b68f88ccc86fc42ff09feca221ef07b03b2386d"

RPROVIDES:${PN} += "kwallet-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Wallet.so.5 \
libQt5Core.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
