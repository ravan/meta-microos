SUMMARY = "LeechCraft Azoth Module to remove CAPS"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth which \
can remove excessive CAPS usage from incoming messages."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-isterique-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "7e745bfccc4d360c04c50c753ad2266f881f79c357909eefeaa10c7cf80bda702dfa9c070f6edefb5ee543de579653b6048604ff9e59c85eaab156b01eb01e7c"

RPROVIDES:${PN} += "leechcraft-azoth-isterique \
libleechcraft-azoth-isterique.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
