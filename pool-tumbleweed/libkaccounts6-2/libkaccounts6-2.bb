SUMMARY = "KDE Accounts Providers - System Library"
DESCRIPTION = "Small system to administer web accounts for the sites and services across the \
Plasma desktop, including: Google, Facebook, Owncloud, IMAP, Jabber and others."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkaccounts6-2-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "bb9fbd80220e30b0d4a6df5290c30077f77c2d1606f0b42fcba8ce6eb8169945fc15f1481a34e18215eb675a1126668bf6e64814e96308f3949edb1f5a010246"

RPROVIDES:${PN} += "libkaccounts6-2 \
libkaccounts6.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libaccounts-qt6.so.1 \
libc.so.6 \
libsignon-qt6.so.1 \
libstdc++.so.6"

inherit rpm
