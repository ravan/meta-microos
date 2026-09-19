SUMMARY = "Gantt chart implementation for kdiagram"
DESCRIPTION = "This package contains the KGantt libraries from the kdiagram package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libKGantt2-2.8.0-2.5.aarch64.rpm"
RPM_HASH = "c0d318f39a4ab678b743a9732b6fd0afbb97c5e1ec5517c403cb57d8999ddcc5866a5afe8ec78722801046fdc70b9e9f56d4aea980d45f14913c8d84973d5731"

RPROVIDES:${PN} += "libKGantt.so.2 \
libKGantt2 \
libkgantt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
