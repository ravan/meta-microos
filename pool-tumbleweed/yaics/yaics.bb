SUMMARY = "A simple GNU social client written in C++/Qt"
DESCRIPTION = "Yaics is a simple GNU social client written in C++ and Qt and \
licensed under the GNU GPL 3.0 (or later)."
LICENSE = "GPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "yaics-0.6-3.4.aarch64.rpm"
RPM_HASH = "4e1621cb4f8d3005fbfb9ef947cf3cd68ea8dcf3363d27b99a69cb8bdd85f99fd2e9c6fd6d5c6c3ad470a59cd5b05607fa7349d19062b4e9734765b52d618e41"

RPROVIDES:${PN} += "yaics"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
