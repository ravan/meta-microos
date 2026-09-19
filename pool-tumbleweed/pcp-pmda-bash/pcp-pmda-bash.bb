SUMMARY = "Performance Co-Pilot (PCP) metrics for the Bash shell"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Bash shell."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-bash-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "9688c04d21eb2540cd885bcd243b1e3f1c4de78c6692ebeb1f6e9fe86c4b45521cf02934924134b1b4a8ac315e52f48ba6325288485394d2379dbf1055ec57e7"

RPROVIDES:${PN} += "pcp-pmda-bash"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
