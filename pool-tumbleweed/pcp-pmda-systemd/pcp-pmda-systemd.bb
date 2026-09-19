SUMMARY = "Performance Co-Pilot (PCP) metrics from the Systemd journal"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from the Systemd journal."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-systemd-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "22350820663f0c60744ad78c07a6190241da7287f2adb668f97db72f9ede956d569c4afcaa5f1bc2ce3663ddad278166e14d1003869b947d050bfa0560c37e78"

RPROVIDES:${PN} += "pcp-pmda-systemd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libsystemd.so.0"

inherit rpm
