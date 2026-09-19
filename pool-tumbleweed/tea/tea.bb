SUMMARY = "Qt-based text editor with image viewer"
DESCRIPTION = "TEA is a Qt-based text editor. It supports reading FB2, ODT, RTF, \
DOCX, Abiword, KWord KWD and SWX documents, though only writes out \
plaintext. Image viewing is possible as well. It has a built-in \
Midnight-Commander-style file manager, integrates spell checking \
(aspell/hunspell), and syntax highlighting for a number of languages."
LICENSE = "GPL-3.0-or-later"

PV = "61.2.0"

RPM_NAME = "tea-61.2.0-2.5.aarch64.rpm"
RPM_HASH = "de2021bfc696b6d55b545b24cc9d7ee14221cbeb262f69ab4397d04ef078695f676e04637edd4830e71261af3ca4a3315fef7893c24542820993c5ed71c0488d"

RPROVIDES:${PN} += "tea"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
