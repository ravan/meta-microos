SUMMARY = "LeechCraft HTTP Server Module"
DESCRIPTION = "This package provides content from local filesystem over LANs. \
(Possibly also WANs, but, by default, only LAN interfaces are listened on)."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-htthare-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "efb213fa57fcc8847d820cc2f51309f028baa461dc5b3980c400bbf875ca170c9c4f394717de94e6fbdb7afc1603cf6020f33dd9c7c609ab7e8d951f75d3a691"

RPROVIDES:${PN} += "leechcraft-htthare \
libleechcraft-htthare.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xsd-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
