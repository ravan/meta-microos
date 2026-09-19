SUMMARY = "Performance Co-Pilot (PCP) metrics uWSGI servers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) \
for collecting metrics from uWSGI servers."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-uwsgi-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "d888d58afe3094b8705eaadd7cd9c13e4be8e03c94682921f5b16e9ff510a56ba9cfd51dd0d2bd4a6338d47a7a2b2ec53ca08711b746a406124a94c4fcbd83e3"

RPROVIDES:${PN} += "config-pcp-pmda-uwsgi \
pcp-pmda-uwsgi"

RDEPENDS:${PN} += "/usr/bin/pmpython \
/usr/bin/sh"

inherit rpm
