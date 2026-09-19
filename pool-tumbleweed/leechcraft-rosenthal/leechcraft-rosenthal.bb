SUMMARY = "LeechCraft Spell Checker Module"
DESCRIPTION = "This package provides a spell checker plugin for LeechCraft. \
 \
It is based on Hunspell or Myspell dictionaries."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-rosenthal-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "a30dd9ebd51609bf8ebc950c9ff9b7e4b2e3ae4ca739c4d7906f30f6037fa381949db8f38228690e1ef9fe27467e3fd627493ce296563431f4fe744c9f36ee8e"

RPROVIDES:${PN} += "leechcraft-rosenthal \
libleechcraft-rosenthal.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
