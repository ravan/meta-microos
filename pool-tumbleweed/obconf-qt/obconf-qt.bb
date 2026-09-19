SUMMARY = "OpenBox window manager configuration tool"
DESCRIPTION = "Configuration tool for the OpenBox Window Manager. \
This tool is used by LXQt to configure OpenBox, since it is \
used as the default WindowManager in LXQt."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.6"

RPM_NAME = "obconf-qt-0.16.6-1.5.aarch64.rpm"
RPM_HASH = "b4830c16de9b6c49957a3dfaeaa88487e28745a265eca48cbffcd2c83093de7b18e53f50898546d1435f01d8b7afd513715d6280f7e39c786965cffafeb6b774"

RPROVIDES:${PN} += "obconf-qt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libobrender.so.32 \
libobt.so.2 \
libstdc++.so.6 \
libxml2.so.16 \
update-alternatives"

inherit rpm
