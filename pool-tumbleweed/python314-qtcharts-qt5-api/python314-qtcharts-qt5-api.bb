SUMMARY = "Eric API files for python314-qtcharts-qt5"
DESCRIPTION = "This package provides Qt5 Charts library API files for the Eric IDE."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python314-qtcharts-qt5-api-5.15.6-5.8.aarch64.rpm"
RPM_HASH = "1b355e003243618e723b35ed91fcf62f9c54517a9fc561a3e2730a6a83e56fe921f658b26c4d920a14a0488fa2d27c9a202c65a627707548f6c40b2e1b395cd3"

RPROVIDES:${PN} += "python314-qtcharts-qt5-api"

RDEPENDS:${PN} += ""

inherit rpm
