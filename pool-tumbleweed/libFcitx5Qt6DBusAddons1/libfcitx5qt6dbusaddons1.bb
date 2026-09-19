SUMMARY = "Qt6 DBus Addons library for Fcitx5"
DESCRIPTION = "This package provides Qt6 DBus Addons library for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.1.12"

RPM_NAME = "libFcitx5Qt6DBusAddons1-5.1.12-1.10.aarch64.rpm"
RPM_HASH = "800c872a1cddd9c318554757ecbbe763b2feeb6d98d463dfce718be629697ac4c24341f74c54856f52f537255485225a23f1546aaaf13a9943b83fa0cff49494"

RPROVIDES:${PN} += "libFcitx5Qt6DBusAddons.so.1 \
libFcitx5Qt6DBusAddons1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
