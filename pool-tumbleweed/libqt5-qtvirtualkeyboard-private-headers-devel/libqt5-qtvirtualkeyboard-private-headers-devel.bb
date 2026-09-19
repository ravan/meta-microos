SUMMARY = "Non-ABI stable API for the Qt5 Virtual Keyboard"
DESCRIPTION = "This package provides private headers of libqt5-qtvirtualkeyboard that are \
normally not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "GPL-3.0"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-private-headers-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "e1b9f55a2224a63ab50da6b0e6684650ac1467d3ea097468f4a66ca8a2d0d12a06d48338796373b794f4310d223362cbf7dcf512dc5d590e90b233454d5635e4"

RPROVIDES:${PN} += "libqt5-qtvirtualkeyboard-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libqt5-qtvirtualkeyboard-devel"

inherit rpm
