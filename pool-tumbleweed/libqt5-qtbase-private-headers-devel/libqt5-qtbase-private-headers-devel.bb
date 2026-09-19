SUMMARY = "Non-ABI stable experimental API"
DESCRIPTION = "This package provides private headers of libqt5-qtbase-devel that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libqt5-qtbase-private-headers-devel-5.15.19+kde96-1.3.noarch.rpm"
RPM_HASH = "f6a92fa94d5d702c595117038692e6bc7f460215b7660a11794fe6c746fe00adf3fed0b79594a573280ccd468c75f922c3ea1d8ed4b87b46d66c10368ce0a25d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtbase-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5DBus-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5KmsSupport-private-headers-devel \
libQt5Network-private-headers-devel \
libQt5OpenGL-private-headers-devel \
libQt5PlatformSupport-private-headers-devel \
libQt5PrintSupport-private-headers-devel \
libQt5Sql-private-headers-devel \
libQt5Test-private-headers-devel \
libQt5Widgets-private-headers-devel \
libqt5-qtbase-devel"

inherit rpm
