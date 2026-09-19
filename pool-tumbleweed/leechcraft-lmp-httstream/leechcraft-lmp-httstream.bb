SUMMARY = "LeechCraft Music Streamer Module"
DESCRIPTION = "This package provides a streamer plugin for LeechCraft player \
to stream music from LMP via HTTP."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-lmp-httstream-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "1014e5ee286c38063043b7d52192a41dea48b3a5a219b894d7d9f175d067c9c9d4ac7bea711053176a371ccaccfedd4d65659c77c30072a724a5dcb3db97f681"

RPROVIDES:${PN} += "leechcraft-lmp-httstream \
libleechcraft-lmp-httstream.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libleechcraft-lmp-util-qt6.so.0.6.75 \
libleechcraft-util-network-qt6.so.0.6.75 \
libleechcraft-util-xsd-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
