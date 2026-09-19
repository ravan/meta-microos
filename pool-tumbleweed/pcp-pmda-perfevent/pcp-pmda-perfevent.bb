SUMMARY = "Performance Co-Pilot (PCP) metrics for hardware counters"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting hardware counters statistics through libpfm."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-perfevent-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "6d4ad997aba3fd1eaafa23f21f6a39468acf8e6132cb764790b0665af938ec4b56b3be43f80acacd9efd72755881cf740f506290525aa3f638b8f154e93ea266"

RPROVIDES:${PN} += "config-pcp-pmda-perfevent \
pcp-pmda-papi \
pcp-pmda-papi-debuginfo \
pcp-pmda-perfevent"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpfm.so.4"

inherit rpm
