SUMMARY = "Development files for for Cockpit"
DESCRIPTION = "This package contains files used to develop cockpit modules"
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & MIT & CC-BY-SA-3.0 & BSD-3-Clause"

PV = "365"

RPM_NAME = "cockpit-devel-365-2.1.aarch64.rpm"
RPM_HASH = "c59c684d8da58cab1c07fde01342a34b2d394d7c912f3600eaf553d250113f9fa66162138322899538c251b1e8a560f507f3eb37617d42a1499dcf97d4951738"

RPROVIDES:${PN} += "cockpit-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
