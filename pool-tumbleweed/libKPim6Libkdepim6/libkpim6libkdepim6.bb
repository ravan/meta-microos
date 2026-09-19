SUMMARY = "libkdepim library"
DESCRIPTION = "The libkdepim library"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6Libkdepim6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "81b98b8a3e6755924aaf5d2eb7dfd917b365e9d38b4c802e6325150e4586a27568b8bc8128095c9a0104a858a635422d36432f4bd2c445276e397da045b0715e"

RPROVIDES:${PN} += "libKPim6Libkdepim.so.6 \
libKPim6Libkdepim6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libkdepim \
libstdc++.so.6"

inherit rpm
