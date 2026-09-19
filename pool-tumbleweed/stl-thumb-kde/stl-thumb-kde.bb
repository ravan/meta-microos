SUMMARY = "Stl-thumb is a fast lightweight thumbnail generator for STL files."
DESCRIPTION = "This is the KDE / KIO plugin for stl-thumb. \
It shows previews of .stl files in Dolphin and throughout the KDE desktop."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "stl-thumb-kde-0.5.0-1.7.aarch64.rpm"
RPM_HASH = "1ff525a90d9da632ba274ab1e999a9b439242cf382dc2fcab9f20606534417d03f370eb66fd915c381ef595bf1a9f85305b971391b15cf148a2d12941bdf7af5"

RPROVIDES:${PN} += "stl-thumb-kde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6KIOGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6 \
libstl-thumb.so"

inherit rpm
