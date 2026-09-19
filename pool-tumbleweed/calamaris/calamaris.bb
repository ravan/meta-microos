SUMMARY = "A Report Generator"
DESCRIPTION = "Calamaris parses log files from Squid V1.1.x, V1.2.x, V2.x, and NetCache in \
native log format and generates a report."
LICENSE = "GPL-2.0-or-later"

PV = "2.99.4.8"

RPM_NAME = "calamaris-2.99.4.8-1.2.noarch.rpm"
RPM_HASH = "ec785394330ae13921a10edc0f5cab480642fc2da71fc55ea558aa300c7efaa031861f63930ad612c4cb757ea7138c14634dd998981223694a51451cdddee9e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calamaris"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
