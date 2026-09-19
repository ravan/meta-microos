SUMMARY = "Libraries for Nagios plugins"
DESCRIPTION = "This package includes the libraries (scripts) that are included by many \
of the standard checks."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-common-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "5259ec1028051e0c7bb49964cd99fbf46b560f4914faaab10ac1a7ce6112cc8f472699f8b49d2270e3230325c65f07d0cebe7441bf1bdfe1552ca217028988de"

RPROVIDES:${PN} += "config-monitoring-plugins-common \
monitoring-plugins-common \
nagios-plugins-common \
perl-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
