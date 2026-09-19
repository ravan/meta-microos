SUMMARY = "LeechCraft Azoth module for conference-oriented commands"
DESCRIPTION = "This package provides some common conference-oriented commands like \
/vcard, /time, /last, /subject, /kick, /ban and so on for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-mucommands-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "bbdb63be84fda03ae4e00e38db6ab4477e39bf662bfcab3a3ca27fd24c38a5b29843ae1f30548631ba345f2d5e049a3e01cf9596ed68898627deecb862e4f050"

RPROVIDES:${PN} += "leechcraft-azoth-mucommands \
libleechcraft-azoth-mucommands.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth-protocolplugin \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-azoth-util-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
