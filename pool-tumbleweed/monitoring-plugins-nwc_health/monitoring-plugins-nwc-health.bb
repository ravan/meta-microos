SUMMARY = "This plugin checks the health of network components and interfaces"
DESCRIPTION = "This plugin checks the hardware health and various interface metrics of \
network components like switches and routers."
LICENSE = "GPL-2.0-or-later"

PV = "12.13.1"

RPM_NAME = "monitoring-plugins-nwc_health-12.13.1-1.1.noarch.rpm"
RPM_HASH = "9e8ef47edb44205ff24ae1e6f9536655b186ba71972be1d317531d4c951937fe7aad6839e5ca28d14206e8b1974524de6ebdee2d32298277450f5199f5fb0bad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-nwc-health \
nagios-plugins-nwc-health"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-File--Slurp \
perl-JSON \
perl-JSON--XS \
perl-Nagios-Plugin \
perl-Net-SNMP"

inherit rpm
