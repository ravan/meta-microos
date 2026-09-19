SUMMARY = "LeechCraft Azoth module for 'Last Seen' functionality"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth which records \
contacts' last online and availability time on the client side. It \
does not depend on a concrete protocol implementation."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-lastseen-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "26dbea888bb1fa0cbbe931bf528ca8ca428598b09d5fca18ea78e3af7f6d4d6f355aaca3771d495a2909b8187a324817f0b5cbc739895319a705a1d70991d0f7"

RPROVIDES:${PN} += "leechcraft-azoth-lastseen \
libleechcraft-azoth-lastseen.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Sql.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
