SUMMARY = "Xquarto is a board game designed for the X windows environment"
DESCRIPTION = "The game is a two-player game. Player 1 chooses one of the 16 pieces. \
Player 2 then places this piece on one of the 16 squares of the board \
and chooses a piece out of the remaining 15 pieces which he gives to \
player 1, who places this piece on one of the remaining 15 squares on \
the board, etc... \
 \
Xquarto supports three different player combinations: human vs \
computer, computer vs human and human vs human (possibly through the \
local network in the latter case). The default combination is human vs \
computer, i.e. the human player starts the game against the computer. \
This can be changed by clicking on the 'Actions' menu (see below for \
more details)."
LICENSE = "GPL-2.0-or-later"

PV = "2.5"

RPM_NAME = "xquarto-2.5-818.5.aarch64.rpm"
RPM_HASH = "5b03f060100ab673ddfcdccaa217ddc44f6d681d624ca66bb6ef74d5efc800bb13fb82ff789bc26bace1e037e8510c3392b7e76e49f16b52f22888131f3ef447"

RPROVIDES:${PN} += "xquarto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
