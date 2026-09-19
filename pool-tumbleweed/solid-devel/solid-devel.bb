SUMMARY = "KDE Desktop hardware abstraction: Build Environment"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "solid-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "03729efd69be807b20442c4fe0c4b71bacc441e2127264c4a4e05e547d143b492d8ab4042018180a7aa1d91212d7d4bb18fc9c3826010d45be26e255ed60b438"

RPROVIDES:${PN} += "cmake-KF5Solid \
solid-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
libKF5Solid5"

inherit rpm
