SUMMARY = "Monitor Servertech devices that use the Sentry3 MIB"
DESCRIPTION = "This Nagios check monitors Servertech devices that use the Sentry3 MIB. \
 \
It checks the following: \
 \
1) Environmental temperature (Auto-detects all sensors) \
2) Environmental humidity (Auto-detects all sensors) \
3) Input power (Auto-detects all input feeds)"
LICENSE = "GPL-2.0-or-later"

PV = "2012"

RPM_NAME = "monitoring-plugins-sentry3-2012-102.7.noarch.rpm"
RPM_HASH = "e12e484ca58a8652cf6762f7bb113574c6da230e035c878ffa9d0dd1bb8ba6298055bd718c1c16dc03939e9e65e11541aa428b55494ad17efb9d4d391b0d107b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-sentry3 \
nagios-plugins-sentry3"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Nagios--Plugin \
perl-Net--SNMP"

inherit rpm
