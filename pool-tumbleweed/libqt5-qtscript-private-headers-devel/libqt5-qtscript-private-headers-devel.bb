SUMMARY = "Non-ABI stable experimental API for the Qt5 Script library"
DESCRIPTION = "This package provides private headers of libqt5-qtscript that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "(LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later) & LGPL-2.0-or-later & LGPL-2.1-only"

PV = "5.15.19"

RPM_NAME = "libqt5-qtscript-private-headers-devel-5.15.19-1.3.noarch.rpm"
RPM_HASH = "b9d8db8189b804c2d10ef41d54a9d39e124de2074b16ac883bafdac5aa50f21f3797e25498e2dd9b61eb3e8be832428def1e69a2c5eda8707f6b6daee7c77586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Script-private-headers-devel \
libqt5-qtscript-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Widgets-private-headers-devel \
libqt5-qtscript-devel"

inherit rpm
