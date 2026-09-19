SUMMARY = "Check Oracle status"
DESCRIPTION = "Check Oracle database health status."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-oracle-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "06d734008fb689c2b27a907cf1c1ffe3731533b93bae2f542b3547a22806d17a95b8eb1e964cb429ea813ee5fcaa8c58367a065ad04900f3d42422b5fb9e3aa8"

RPROVIDES:${PN} += "monitoring-plugins-oracle \
nagios-plugins-oracle"

RDEPENDS:${PN} += "/usr/bin/sh \
monitoring-plugins-common"

inherit rpm
