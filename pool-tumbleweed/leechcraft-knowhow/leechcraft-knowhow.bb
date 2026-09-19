SUMMARY = "LeechCraft 'Tip of the day' Module"
DESCRIPTION = "This package provides a tips plugin for LeechCraft which \
displays a 'tip of the day' window after launching LeechCraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-knowhow-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "bcb8acb5d2f30b864f6a908b8e578fa448eeef89fedf20de75fcb8ea06aa95034020203b6001b5725fa6b72ae0dd2d07adf415a6d72103ad5b331a51d577a0e6"

RPROVIDES:${PN} += "leechcraft-knowhow \
libleechcraft-knowhow.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
