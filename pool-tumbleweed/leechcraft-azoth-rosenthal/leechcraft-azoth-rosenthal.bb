SUMMARY = "LeechCraft Azoth Spell Checker Module"
DESCRIPTION = "This package provides a spell checker plugin for LeechCraft Azoth. \
 \
It is based on Hunspell or Myspell dictionaries."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-rosenthal-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "61f18a22de17ee6cfef496d1e61bb10291f9d20c9bb07886d4d65297af6d07f83b9325e0cfb50635babb132f6d9f4ee640794c26271806062027d6abeb0c8e3c"

RPROVIDES:${PN} += "leechcraft-azoth-rosenthal \
libleechcraft-azoth-rosenthal.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
leechcraft-rosenthal \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
