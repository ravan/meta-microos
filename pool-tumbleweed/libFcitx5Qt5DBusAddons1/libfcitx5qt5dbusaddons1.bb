SUMMARY = "Qt5 DBus Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt5 DBus Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.1.12"

RPM_NAME = "libFcitx5Qt5DBusAddons1-5.1.12-1.10.aarch64.rpm"
RPM_HASH = "85c42f600ca644b1bc2aa7a5ff44db941c7931b132bfe9b44dc0fd864b514561096c2919c36fe458e0911924a833aa82c4981f40afef0dc43770acab5b9f6dd5"

RPROVIDES:${PN} += "libFcitx5Qt5DBusAddons.so.1 \
libFcitx5Qt5DBusAddons1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
