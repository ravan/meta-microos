SUMMARY = "ANSI Terminal Escape Code Converter - Qt GUI"
DESCRIPTION = "This package provides a Qt Graphical User Interface to run ansifilter."
LICENSE = "GPL-3.0-or-later"

PV = "2.23"

RPM_NAME = "ansifilter-gui-2.23-1.1.aarch64.rpm"
RPM_HASH = "56476a12dcfd11363d9a02f7c8b7b8139eedfd817e453f6cd1e5f1972ea64fdb830a87169f7e0d21ab6a48da2fd7574d17856667ab401eb5af6fd7a438573436"

RPROVIDES:${PN} += "ansifilter-gui"

RDEPENDS:${PN} += "ansifilter \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
