SUMMARY = "KDE Partition Manager core library"
DESCRIPTION = "Library for managing partitions. Common code for KDE Partition Manager and \
other projects. \
 \
Main kpmcore library."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "libkpmcore13-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a1ebc24c9e46fdb5f396e286fe64bb34a8a3be1c5120ac17deb5e04717faf8eca32e26fb7fdd1adb869c0939f180652e48689343542ac7f2179d04a673954fe9"

RPROVIDES:${PN} += "libkpmcore.so.13 \
libkpmcore13"

RDEPENDS:${PN} += "/sbin/ldconfig \
kpmcore \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libblkid.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
