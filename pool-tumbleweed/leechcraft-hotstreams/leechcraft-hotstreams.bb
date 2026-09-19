SUMMARY = "LeechCraft Radio streams Module"
DESCRIPTION = "This package provides a radio streams provider plugin for LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-hotstreams-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "0288636368e05fcf8accb9acbf74805f0c84763957fb1c8a9df767dab71f33b025266ab66318ed96fd31ada991c05b32cb813813698a389e9c40c0695253741f"

RPROVIDES:${PN} += "leechcraft-hotstreams \
libleechcraft-hotstreams.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
