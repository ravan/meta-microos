SUMMARY = "Graphical effect and filter library for Qt5"
DESCRIPTION = "libqimageblitz5 is a graphical effect and filter library for Qt5 \
that contains many improvements over KDE 3.x's kdefx library \
including bugfixes, memory and speed improvements, and MMX/SSE \
support."
LICENSE = "BSD-2-Clause"

PV = "0.0.6+svn1515099"

RPM_NAME = "libqimageblitz5-1-0.0.6+svn1515099-4.25.aarch64.rpm"
RPM_HASH = "1016bbf85694341c746ede1637de95a10d72458681afd83e76033ef7df84a970efa69d06599a09c2517382e53de9c603d02af1465f60f652ac04da74753927ae"

RPROVIDES:${PN} += "libqimageblitz5-1 \
libqimageblitz5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
