SUMMARY = "LeechCraft Task Progress Indicator Module"
DESCRIPTION = "This package provides a Task Progress Indicator quark plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-tpi-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "e121c28b3eed54c29c1cdbd8cd6e71c3570764508b4bcfe4985b603fbe7386624eee246cb3e13260555a76854eb2de01345af37ee31540fb478d45abad4b8f63"

RPROVIDES:${PN} += "leechcraft-tpi \
libleechcraft-tpi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Window"

inherit rpm
