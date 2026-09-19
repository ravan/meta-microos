SUMMARY = "Non-ABI stable experimental API for the Qt5 NetworkAuth Library"
DESCRIPTION = "This package provides private headers of libqt5-qtnetworkauth that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtnetworkauth-private-headers-devel-5.15.19+kde0-1.3.noarch.rpm"
RPM_HASH = "835d115e2d1d406a17623449ee691d71be7d3d241b263f3c3567bd02e4d6224b47490e72657e57d73b3cb4bb4e9a29b81fa9964014de934bd285d4c093582ede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtnetworkauth-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtnetworkauth-devel"

inherit rpm
