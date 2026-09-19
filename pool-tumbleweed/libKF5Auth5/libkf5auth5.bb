SUMMARY = "Framework which lets applications perform actions as a privileged user"
DESCRIPTION = "KAuth is a framework to let applications perform actions as a privileged user."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Auth5-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "4638be6b735e23f8bdb3aefcd31e1beaf7668989192bf5099e8d7b73863436e867617ba3c927662ad1498bd89944fce7127207ef69203c6e3c3bebbe68f40dff"

RPROVIDES:${PN} += "libKF5Auth.so.5 \
libKF5Auth5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5AuthCore5 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libpolkit-qt5-core-1.so.1 \
libstdc++.so.6"

inherit rpm
