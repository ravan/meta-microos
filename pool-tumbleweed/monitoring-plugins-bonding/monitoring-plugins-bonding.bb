SUMMARY = "Nagios Network Bonding Check"
DESCRIPTION = "This script attempts to read the proc interface to the Linux kernel bonding \
driver, and determine if the bonded interfaces are optimal. It will warn if any \
of the enslaved devices are not 'up' (exit 1), and if any bonded interfaces are \
not active at all (exit 2). This script is suitable for feeding to NRPE for \
Nagios (or similar) to check."
LICENSE = "GPL-2.0-or-later | Artistic-1.0"

PV = "0.002"

RPM_NAME = "monitoring-plugins-bonding-0.002-108.16.noarch.rpm"
RPM_HASH = "189d61bc181956a5254d755696f6eb0670486632c4a9b3c8928e67e467731e03be8f731989af9b615ef81f3a494d6791910a2f423dd5304942d3afc78ec68403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-monitoring-plugins-bonding \
monitoring-plugins-bonding \
nagios-plugins-bonding"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
