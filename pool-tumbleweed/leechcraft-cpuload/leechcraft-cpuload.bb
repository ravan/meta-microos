SUMMARY = "LeechCraft CPU Usage Monitoring Module"
DESCRIPTION = "This package provides a quark for monitoring the CPU usage \
for LeechCraft SB2. It currently uses /proc/stat."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-cpuload-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "80692aac638f592e32680c217b8fefa7ef3dd4ad559e7dccb10f3cba4404d09fbd5533d0cca78648d6c3821364a5f75c8dfb53dc7a802bcd62431d9e37a39ab0"

RPROVIDES:${PN} += "leechcraft-cpuload \
libleechcraft-cpuload.so"

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
qt6qmlimport-QtQuick.Window"

inherit rpm
