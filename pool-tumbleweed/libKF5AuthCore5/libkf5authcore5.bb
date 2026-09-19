SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5AuthCore5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "587afbdacc696218cef9f2871c123e9e19d1cb213ce939588eba32ffb3e59b89e715afe1f4b5e9ed000828f3ea6c949528902b52027bb812aee2d4c66b163a96"

RPROVIDES:${PN} += "libKF5AuthCore.so.5 \
libKF5AuthCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
