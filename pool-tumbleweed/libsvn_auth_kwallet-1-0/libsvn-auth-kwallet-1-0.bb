SUMMARY = "KWallet support for Subversion"
DESCRIPTION = "Provides KWallet integration for Subversion"
LICENSE = "Apache-2.0"

PV = "1.14.5"

RPM_NAME = "libsvn_auth_kwallet-1-0-1.14.5-5.3.aarch64.rpm"
RPM_HASH = "29b4953bd9ddaf31888766fbcb0ad4ce0a0e3419f5d3a95a47f33f95e90ca630c99b5a9cfe86c56db52f8243e1532d04fce7b456ae7244f646496fb296f68b9c"

RPROVIDES:${PN} += "libsvn-auth-kwallet-1-0 \
libsvn-auth-kwallet-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Wallet.so.5 \
libQt5Core.so.5 \
libapr-1.so.0 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsvn-subr-1.so.0 \
subversion"

inherit rpm
