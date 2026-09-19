SUMMARY = "LeechCraft Azoth Ignore Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth to ignore \
unwanted participants."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-depester-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "47479073d14dbe22133245a4853481d4c75bc43e37bf5b4aab28ea0314e4c665bafabcd5124499eb0bd3ef9281e7b5d47cc8595ebccddbd0c43ce1ba78187009"

RPROVIDES:${PN} += "leechcraft-azoth-depester \
libleechcraft-azoth-depester.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-azoth-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
