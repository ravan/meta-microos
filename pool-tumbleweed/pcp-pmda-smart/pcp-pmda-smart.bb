SUMMARY = "Performance Co-Pilot (PCP) metrics for S.M.A.R.T values"
DESCRIPTION = "This package contains the PCP Performance Metric Domain Agent (PMDA) for \
collecting metrics of disk S.M.A.R.T values making use of data from the \
smartmontools package."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-smart-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "ff08a3715e5edc89954f0fd403699cd9c5986b2d6bdd1856866f4f7d002cc0bf39ff64ca4e94f7cee33f527f974e5cb96c574f100e7d33e5e5ab2a8990cfc98a"

RPROVIDES:${PN} += "pcp-pmda-smart"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3"

inherit rpm
