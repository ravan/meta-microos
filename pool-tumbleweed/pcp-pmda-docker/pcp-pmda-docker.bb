SUMMARY = "Performance Co-Pilot (PCP) metrics from the Docker daemon"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics using the Docker daemon REST API."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-docker-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "23ce1b84e754da97a8714208ee6a09899395f82c547be6649a6a196f608f508224aad0d0c813cace50980b9a7560829d2e18360896585f510a020ea9a1fe6339"

RPROVIDES:${PN} += "pcp-pmda-docker"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp-web.so.1 \
libpcp.so.3"

inherit rpm
