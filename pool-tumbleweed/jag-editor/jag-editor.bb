SUMMARY = "Level Editor for the JAG game"
DESCRIPTION = "The aim of JAG is to break all of the target pieces on each level, \
and to do this before the time runs out. Keep doing this until you \
have beaten the last level and won the game. \
 \
This package contains the level editor for JAG."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.8"

RPM_NAME = "jag-editor-0.3.8-2.22.aarch64.rpm"
RPM_HASH = "e2c3978487ac76a4a29c70538ad39ff0480a18a756cf2c3fe3a38ebd738266cb9e1b0c83efc51bf98e5442c860430621d6ff02fa65121ebce7556e6f82625dd2"

RPROVIDES:${PN} += "jag-editor \
jag-level-editor"

RDEPENDS:${PN} += "jag \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
