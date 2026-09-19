SUMMARY = "Graphical user interface to svgcleaner"
DESCRIPTION = "This package provides a Qt graphical user interface to svgcleaner."
LICENSE = "GPL-2.0-only"

PV = "0.9.5"

RPM_NAME = "svgcleaner-gui-0.9.5-4.7.aarch64.rpm"
RPM_HASH = "d95dedd0329170d8899519e53affeab21942c5165acfbea738d4dc2b3258d344f4f680f81f42a489af13fce6b8a2bd55eff325b22b5dbf3350e23df54e533872"

RPROVIDES:${PN} += "svgcleaner-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
p7zip \
svgcleaner"

inherit rpm
