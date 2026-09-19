SUMMARY = "Development files for libkddockwidgets"
DESCRIPTION = "Development files for libkddockwidgets."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.4.1"

RPM_NAME = "kddockwidgets-qt6-devel-2.4.1-1.2.aarch64.rpm"
RPM_HASH = "84d44486be909ccea06e785fd262095c8866306e7135cb023c36915c93637c706ec10a002e6a7d643ea1490b925f9df3389a859a1a4937944c4b8f448dd9719c"

RPROVIDES:${PN} += "cmake-KDDockWidgets-qt6 \
kddockwidgets-qt6-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick \
cmake-Qt6QuickControls2 \
cmake-Qt6Widgets \
libkddockwidgets-qt6-3"

inherit rpm
