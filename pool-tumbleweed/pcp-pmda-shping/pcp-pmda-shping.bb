SUMMARY = "Performance Co-Pilot (PCP) metrics for shell command responses"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about quality of service and response time measurements of \
arbitrary shell commands."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-shping-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "1b9021d309c4e263232060d09fa2b9c657bd2bb30e437288e283eff7b06ec50b7ccba7da74a89b1cc3979e78076bb3d8c20f6569fa8e6cdadd6b3be314f70439"

RPROVIDES:${PN} += "config-pcp-pmda-shping \
pcp-pmda-shping"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
