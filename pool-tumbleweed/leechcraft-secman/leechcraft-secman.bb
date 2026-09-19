SUMMARY = "LeechCraft Security manager Module"
DESCRIPTION = "This package provides a security manager plugin for LeechCraft. \
 \
It is the base module for secure storage. \
Particular storage backends are implemented by subplugins."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-secman-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "ef901f4bccffb8169e379a24e0569aedd67d671649d26b2269a4ecec4ea3db2674d21cba729b9e246287441d8572780675d994b980098fecef70c09d86896924"

RPROVIDES:${PN} += "leechcraft-secman \
leechcraft-securestorage \
libleechcraft-secman.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-secman-simplestorage \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
