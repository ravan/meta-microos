SUMMARY = "Cockpit user interface for kernel crash dumping"
DESCRIPTION = "The Cockpit component for configuring kernel crash dumping."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & MIT & CC-BY-SA-3.0 & BSD-3-Clause"

PV = "365"

RPM_NAME = "cockpit-kdump-365-2.1.noarch.rpm"
RPM_HASH = "0b090a2a10f56bb61cdacf9bea88da92f01300ec154785f984316077ab99b72373f4d197d9a2fb5397dfb58ef7c2ba9b85fed572ca4db1000b907da9a7a00dc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-kdump"

RDEPENDS:${PN} += "/usr/sbin/kdumptool \
cockpit-bridge \
cockpit-shell"

inherit rpm
