SUMMARY = "Plugin for monitoring DRBD 9 resources"
DESCRIPTION = "This package contains monitoring plugins for monitoring DRBD resources. \
 \
The plugins use output from the following sources to determine the state of each resource: \
* /proc/drbd \
* /usr/sbin/drbdadm sh-resources \
* /usr/sbin/drbdetup events2 --now --statistics \
 \
The following DRBD kernel modules and DRBD Utilities are supported: \
* DRBD 8.4.x with drbd-utils 8.9.6 \
* DRBD 9.0.x with drbd-utils 8.9.6"
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "monitoring-plugins-drbd9-0.1-2.7.noarch.rpm"
RPM_HASH = "79ed54517c0f66fda0232c5c3968ade11dfb429e2b6696d278528554421b413cb21bf65e14bc8fc1be5200b0b6a610adcb156033648aa47336e2b20cdd9ffc43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-drbd9"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Data--Dumper \
perl-Getopt--Std"

inherit rpm
