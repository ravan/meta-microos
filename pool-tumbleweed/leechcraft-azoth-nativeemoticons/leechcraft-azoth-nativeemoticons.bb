SUMMARY = "LeechCraft Azoth Emoticon pack support"
DESCRIPTION = "This package provides an emoticons plugin for LeechCraft Azoth which \
permits to use emoticon packs which are stored in Psi+, Kopete \
format or Azoth format."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-nativeemoticons-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "68e7f02ace5d52fc99e237c6196be847a7226f6915389497029242b01b14f13814a4d6fb061ce4a8ffe92185c98a5b4ef5aab37eb7bd456e0e3f00f2a5f36bb6"

RPROVIDES:${PN} += "leechcraft-azoth-nativeemoticons \
libleechcraft-azoth-nativeemoticons.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
