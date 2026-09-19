SUMMARY = "LeechCraft Azoth Antispam Module"
DESCRIPTION = "This package provides a basic antispam plugin for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-herbicide-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "607d03a428f79acc9006e3d4b5bd109b493f7ee697d9b289390e62ae0948085e4ad9e90bf9b67a59a81190122e482ed74a6238ca36e65aa1c2717139ce9c425c"

RPROVIDES:${PN} += "leechcraft-azoth-herbicide \
libleechcraft-azoth-herbicide.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xsd-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
