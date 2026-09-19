SUMMARY = "Plasma 6 version of ssh-askpass"
DESCRIPTION = "A Plasma 6 version of ssh-askpass with KWallet support."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "ksshaskpass6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "64b5f7d8eb2a3e97c6b86719de663c16894866331b133ee276d03cdbae3a95b05aeb1501d1a661e87a8c6323cf3399cc5a68ebc445c7e188e22bb83c79cb53d0"

RPROVIDES:${PN} += "ksshaskpass \
ksshaskpass5 \
ksshaskpass6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libqt6keychain.so.1 \
libstdc++.so.6"

inherit rpm
