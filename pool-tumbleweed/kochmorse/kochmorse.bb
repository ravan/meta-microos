SUMMARY = "A simple morse tutor using the Koch method"
DESCRIPTION = "A simple morse tutor using the Koch method."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "kochmorse-3.5.1-2.9.aarch64.rpm"
RPM_HASH = "413eef8089940b1fb4cba9c94d668ef9ca6dcc4d3474d80f677c16dd4577318b3757a70377d6740e902138004e10724f0bd984f69a5699bbb5ed731b5e1bc419"

RPROVIDES:${PN} += "kochmorse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
