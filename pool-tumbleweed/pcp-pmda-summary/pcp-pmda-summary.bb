SUMMARY = "Performance Co-Pilot (PCP) summary metrics from pmie"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about other installed pmdas."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-summary-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "bdbb0d1463c73e43e026c5d10274232ab29a40b39a16872c1784db7e1ecd168f5c16c57ef11e669a565143465a17fc54757977e812a1f6efb04f26b125442fe4"

RPROVIDES:${PN} += "config-pcp-pmda-summary \
pcp-pmda-summary"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
