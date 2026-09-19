SUMMARY = "Scan files for digital TV applications v5"
DESCRIPTION = "Scan data needed for some scanning applications from dvb package and maybe \
others. This package contains v5 of the files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "20240503"

RPM_NAME = "dtv-scan-tables-v5-20240503-1.7.noarch.rpm"
RPM_HASH = "65149fe009f6480781d5d82594c21bfb4cc5197305bc03f34b4f2aa6462ddfc9c21c9a4c9af841e439726a663ebbf7616b64533627d23f42aacb214a1bd1e186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dtv-scan-tables-v5"

RDEPENDS:${PN} += ""

inherit rpm
