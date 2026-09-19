SUMMARY = "Non-ABI stable experimental API for the Qt5 SerialPort library"
DESCRIPTION = "This package provides private headers of libqt5-qtserialport that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtserialport-private-headers-devel-5.15.19+kde0-1.3.noarch.rpm"
RPM_HASH = "d014a2a85f5ae214969da6c7ab578b9e4975054526bbb8ed5a6caa194bf9699a100662cb9d6e3e7b8359e5db2afcd4f40575ef3758f33525781d580ba23fa8c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5SerialPort-private-headers-devel \
libqt5-qtserialport-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtserialport-devel"

inherit rpm
