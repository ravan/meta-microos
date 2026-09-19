SUMMARY = "Monitoring plugin for APC Smart-UPSes using apcupsd"
DESCRIPTION = "Nagios plugin to monitor APC Smart-UPSes using apcupsd."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "monitoring-plugins-apcupsd-1.3-3.7.noarch.rpm"
RPM_HASH = "3ab4f3f6f8f9c7ec9ba8ca5c52fcf203ab895832c3a07a9c932f208d0b937e2e6aa7514d661a0249e572e1667249c5728092c2d1e90c3115338a6ef1394c2938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-apcupsd \
nagios-plugins-apcupsd"

RDEPENDS:${PN} += "/usr/bin/sh \
apcupsd \
bash \
grep"

inherit rpm
