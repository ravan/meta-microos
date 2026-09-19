SUMMARY = "Test the uptime of the system"
DESCRIPTION = "This plugin tests the uptime on the system using /proc/uptime"
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-uptime-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "139078c395da08351088c8c460c60522d386e17ef03a3c5672f5c6869b2836b5a3c594d645b1e86ac8d7050b76cb7c9b75f2a3e82911a22b2674827db9077640"

RPROVIDES:${PN} += "monitoring-plugins-uptime \
nagios-plugins-ups"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
