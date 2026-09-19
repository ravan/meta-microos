SUMMARY = "Log file pattern detector"
DESCRIPTION = "This plugin provides a log file pattern detector - excluding old \
logfile entries and searching for the given query."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-log-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "f81a36317248ace88026f299be5baed14f0708ee8459856d427bc91958631f3479dfe04adbf068e193c814d81abf48c4f9cc9f402003f24371a8720c2713090d"

RPROVIDES:${PN} += "monitoring-plugins-log \
nagios-plugins-log"

RDEPENDS:${PN} += "/usr/bin/sh \
monitoring-plugins-common"

inherit rpm
