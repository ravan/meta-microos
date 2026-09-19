SUMMARY = "A spell checker and morphological analyzer library"
DESCRIPTION = "Hunspell is a spell checker and morphological analyzer library and \
program designed for languages with rich morphology and complex word \
compounding or character encoding. Hunspell interfaces: Ispell-like \
terminal interface using Curses library, Ispell pipe interface, \
LibreOffice or OpenOffice.org UNO module."
LICENSE = "(GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1+) & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "hunspell-1.7.2-1.14.aarch64.rpm"
RPM_HASH = "1e4a0820ba0f88e213bf0ce37361b4889925f139060ef69e8713d5d5357bb613c4c087b132eaeaa484a6d95d5c7ff17c68cca64dd28da5c121abc03853a39d41"

RPROVIDES:${PN} += "hunspell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libncursesw.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libtinfo.so.6 \
myspell-en-US"

inherit rpm
