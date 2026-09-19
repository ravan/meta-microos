SUMMARY = "Network utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used \
network classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "libleechcraft-util-network-qt6-0_6_75-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "de923834e4a5f569116a106453f0dd8d17da7b88282a771466c2eb5c902ae609490ce655f779afa2029ebb48ea76d687e952d9812cd118cb3ca1bb0eacf95854"

RPROVIDES:${PN} += "libleechcraft-util-network-qt6-0-6-75 \
libleechcraft-util-network-qt6.so.0.6.75"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
