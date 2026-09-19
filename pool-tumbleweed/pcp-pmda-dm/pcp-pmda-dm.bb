SUMMARY = "Performance Co-Pilot (PCP) metrics for the Device Mapper Cache and Thin Client"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Device Mapper Cache and Thin Client."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-dm-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "a459a551bd2ff33991462d3614e684ab4d05ae9ef5956dadf8628b432e7bdfa8ed48ef6703f62dc2af2c05ed15ff4b1c7d5cee9b6890a8e353f613b249d48299"

RPROVIDES:${PN} += "config-pcp-pmda-dm \
pcp-pmda-dm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
