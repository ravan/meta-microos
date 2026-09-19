SUMMARY = "Non-ABI stable experimental API for the Qt5 Sensors library"
DESCRIPTION = "This package provides private headers of libqt5-qtsensors that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtsensors-private-headers-devel-5.15.19+kde0-1.2.noarch.rpm"
RPM_HASH = "5f07b269a3d2ad8e16ad424f078161e8e1da0a779e608bcc6924d1d577289f17e00b41c9a3a9ff520da98e32ed947d32cd14571fbeafa1771e27d3734f81c16d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Sensors-private-headers-devel \
libqt5-qtsensors-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtsensors-devel"

inherit rpm
