SUMMARY = "GUI configuration tool for Picom X composite manager"
DESCRIPTION = "picom-conf is a configuration tool for X composite manager picom."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.0"

RPM_NAME = "picom-conf-0.17.0-2.4.aarch64.rpm"
RPM_HASH = "8c8c219401f002045347b0f7a044b54b3f3e0bc7fa94a8c9b4c539a98344b613e46801e895acf31f464d1caaf9f80761bc95122a23c84155768a8c671965c5ee"

RPROVIDES:${PN} += "config-picom-conf \
picom-conf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libconfig.so.15 \
libgcc-s.so.1 \
libstdc++.so.6 \
picom"

inherit rpm
