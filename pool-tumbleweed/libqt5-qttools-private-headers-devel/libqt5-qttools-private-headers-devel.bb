SUMMARY = "Non-ABI stable experimental API for the Qt5 Tools library"
DESCRIPTION = "This package provides private headers of libqt5-qttools that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde3"

RPM_NAME = "libqt5-qttools-private-headers-devel-5.15.19+kde3-1.8.noarch.rpm"
RPM_HASH = "a0b44c2ddcbec9fe77f15ddf019829fe76e805705bdae83f53d47b46045f3dbb5dfb10842dda9144152b35811c00f6af90b9964c8bde1044dcc6f581dcc8566d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qttools-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qttools-devel"

inherit rpm
