SUMMARY = "Monitor Breezecom wireless equipment"
DESCRIPTION = "This plugin reports the signal strength of a Breezecom wireless equipment."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-breeze-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "6fbf0ed32c17dc07201dd1ee5abbe541d3d8f805607a83fc1c45253a89cc1d3f65698d5fc202e4f54c9d59d63f034c520acfb17ca472d3f10b63c25d06216ba3"

RPROVIDES:${PN} += "monitoring-plugins-breeze \
nagios-plugins-breeze"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
net-snmp \
perl"

inherit rpm
