SUMMARY = "Graphical user interface to launch Solarus games"
DESCRIPTION = "This package provides a graphical user interface to launch games \
based on the Solarus engine."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.5"

RPM_NAME = "solarus-gui-1.6.5-3.3.aarch64.rpm"
RPM_HASH = "88c1a25da760c905ea6b59349a0a4db955ae5f8e74f419789440e8a2ddeb91dab99997b169be995a7ea4118a2c068c35d4a312b85de3a2039ff8a3562283c67a"

RPROVIDES:${PN} += "solarus-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libsolarus-gui.so.1 \
libsolarus.so.1 \
libstdc++.so.6"

inherit rpm
