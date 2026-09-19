SUMMARY = "A block stacking puzzle game"
DESCRIPTION = "Apotris is a block stacking game in the style of Tetris. \
It features satisfying graphics, responsive controls and a large amount \
of customization so that you can tailor the game to your preferences! \
There are 11 game-modes to explore, with various options to keep \
yourself entertained (or challenged)."
LICENSE = "AGPL-3.0-only"

PV = "4.1.0"

RPM_NAME = "apotris-4.1.0-1.6.aarch64.rpm"
RPM_HASH = "1ca023b803c6fbe0ca23c37df96588236c062bf13647cfe97ad9d0f0de1344240a77c0bc50eee16a530e7256fce8d6a64675197f688db9d20d7f294a1faa0328"

RPROVIDES:${PN} += "apotris \
bundled-SoLoud \
bundled-Tileengine"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6 \
libopenmpt.so.0"

inherit rpm
