SUMMARY = "Non-ABI stable experimental API for the Qt5 D-Bus library"
DESCRIPTION = "This package provides private headers of libQt5DBus that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5DBus-private-headers-devel-5.15.19+kde96-1.3.noarch.rpm"
RPM_HASH = "a50296653a89314dea128114fa2f1bf49e7780a0cdc86926f9f954d2c0b7fa49acce325ad68264cde5e03a238c2cf0c0d21e09c1267a3316a896a1ca3ca582d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5DBus-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5DBus-devel"

inherit rpm
