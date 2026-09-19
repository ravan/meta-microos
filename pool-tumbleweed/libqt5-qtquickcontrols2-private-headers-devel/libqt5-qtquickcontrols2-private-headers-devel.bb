SUMMARY = "Headers for the unstable API of the Qt5 QuickControls2 module"
DESCRIPTION = "You need this package if you want to compile programs against the unstable API \
of the Qt5 QuickControls 2 module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde5"

RPM_NAME = "libqt5-qtquickcontrols2-private-headers-devel-5.15.19+kde5-1.2.aarch64.rpm"
RPM_HASH = "f03ab03fe5fc933b6a9a8c5433874ff1b3debedb05f940f90300d4264cab85e4929f4bb32c80a5bfddbc07fdaa65df660fd374344c3ecc82de0288c59434492a"

RPROVIDES:${PN} += "libqt5-qtquickcontrols2-private-headers-devel"

RDEPENDS:${PN} += "libQt5QuickControls2-devel \
libQt5QuickTemplates2-devel"

inherit rpm
