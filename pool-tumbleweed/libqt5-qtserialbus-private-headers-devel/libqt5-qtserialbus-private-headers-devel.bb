SUMMARY = "Non-ABI stable experimental API for the Qt5 SerialBus library"
DESCRIPTION = "This package provides private headers of libqt5-qtserialbus that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtserialbus-private-headers-devel-5.15.19+kde0-1.3.noarch.rpm"
RPM_HASH = "3788dd036b825f1dc3cc6b19074fc74ee5bbf9672920c3dc4be226d8e21cd32c3a076dea6ab31f9d6234bbb753322340121fa9a5a6df28a0da5d3d498d1db109"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtserialbus-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtserialbus-devel"

inherit rpm
