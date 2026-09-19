SUMMARY = "Qt GUI of pstoedit"
DESCRIPTION = "PstoeditQtGui provides an alternative to the command driven operation. \
The GUI provides access to almost all options and features that are \
supported by pstoedit. In addition it supports the conversion of multiple \
files in one job and also provides some shortcuts to some of Ghostscript's \
high leve output devices."
LICENSE = "GPL-2.0-or-later"

PV = "4.3"

RPM_NAME = "pstoedit-gui-4.3-1.1.aarch64.rpm"
RPM_HASH = "00ce1fc9d52da8c3e75b6cf615c0c3241c6f67e7ab7ef6f6c6fa570939d8594d10d981f69e36138aecff8b0a4ae21ebdf930604dc1fda22df3ff66198e9c78a4"

RPROVIDES:${PN} += "pstoedit-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpstoedit.so.0 \
libstdc++.so.6 \
pstoedit"

inherit rpm
