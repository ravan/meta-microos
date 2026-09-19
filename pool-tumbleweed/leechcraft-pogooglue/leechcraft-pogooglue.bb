SUMMARY = "LeechCraft Poshuku Google Search plugin"
DESCRIPTION = "This package provides a LeechCraft plugin to do a Google search \
with some selected text."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-pogooglue-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "6d312c851434437ae59cd855930c828cf91d032236669ac4440d5314aa19d9dbf1537aed4b647e68fac85faf97637891244147015be847a81b919eeb70dd3f2e"

RPROVIDES:${PN} += "leechcraft-pogooglue \
libleechcraft-pogooglue.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
