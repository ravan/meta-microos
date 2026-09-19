SUMMARY = "Non-ABI stable experimental API for the Qt5 gamepad library"
DESCRIPTION = "This package provides private headers of libqt5-qtgamepad that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtgamepad-private-headers-devel-5.15.19+kde0-1.2.noarch.rpm"
RPM_HASH = "fe00f98d2688434a01032a311dba3c2da24832f73add04e3301e93398a978f8b49f265d6c0e1b1c9c72fbf66d65c9d33b74c79bd45fe58bce46b1e3e5edb14f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtgamepad-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtgamepad-devel"

inherit rpm
