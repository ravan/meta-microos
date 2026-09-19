SUMMARY = "Qt-based viewer for HDR files"
DESCRIPTION = "pfsview is a viewer program based on Qt4 for viewing HDR graphic files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsview-2.2.0-5.10.aarch64.rpm"
RPM_HASH = "27e8a7887003259df65f16a53e4fe6c55d536fd760076573e9d3638397f53538eb76847668f3ae76b6666fcbda171247574ea6ed0728380dffdf040457d007b7"

RPROVIDES:${PN} += "pfsview"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
