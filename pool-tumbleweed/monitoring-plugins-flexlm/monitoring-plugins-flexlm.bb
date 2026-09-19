SUMMARY = "Check flexlm license managers"
DESCRIPTION = "Flexlm license managers usually run as a single server or three servers and a \
quorum is needed.  The plugin return OK if 1 (single) or 3 (triple) servers \
are running, CRITICAL if 1(single) or 3 (triple) servers are down, and WARNING \
if 1 or 2 of 3 servers are running."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-flexlm-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "56d6a9021257eeab7d98743fae98390e006e59c6def195500efb5f8cd05086544705a76776f4fa4d6ea9ce603f3d48e9e29bc227742d7d52726e1205ed989042"

RPROVIDES:${PN} += "monitoring-plugins-flexlm \
nagios-plugins-flexlm"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl"

inherit rpm
