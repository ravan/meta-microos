SUMMARY = "Standard LeechCraft Library"
DESCRIPTION = "A library providing some classes and algorithms, not directly \
related to any other library."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-sll-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "b4e963ca40d33d7c610e88dfa47914957096acb1340d62fd50c15b87a2c5f24a235631207b83e1a62b4a7f2e9e7eb60ef437293a64c15d23979522615c66b091"

RPROVIDES:${PN} += "libleechcraft-util-sll-qt6-0-6-75 \
libleechcraft-util-sll-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
