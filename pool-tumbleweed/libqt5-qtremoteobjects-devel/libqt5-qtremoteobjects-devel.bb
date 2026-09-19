SUMMARY = "Development files for the Qt5 RemoteObjects library"
DESCRIPTION = "Qt Remote Objects (QtRO) is an inter-process communication (IPC) \
processes or computers. \
 \
You need this package if you want to compile programs with QtRemoteObjects."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtremoteobjects-devel-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "a81566da6a595c90386c205e53a2af87b6c8464438f52d44944c462caccdc203ec50e5636676bbbd71d73febdafda049d3357f6a30ac1d5e60bcb9fa61849c34"

RPROVIDES:${PN} += "cmake-Qt5RemoteObjects \
cmake-Qt5RepParser \
libqt5-qtremoteobjects-devel \
pkgconfig-Qt5RemoteObjects \
pkgconfig-Qt5RepParser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5RemoteObjects5 \
libqt5-qtremoteobjects-tools \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network"

inherit rpm
