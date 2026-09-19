SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs with the Qt BodyMovin \
library."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Bodymovin-devel-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "e7081f5e1e7272001207d52d919d15631d3e6f18bb5b48e8e7f498e99b8cfddb793cf859704476f6431ec36c7a7d45ce294e17a5282fc8c6821cc975eaa7b751"

RPROVIDES:${PN} += "cmake-Qt5Bodymovin \
libQt5Bodymovin-devel"

RDEPENDS:${PN} += "libQt5Bodymovin5"

inherit rpm
