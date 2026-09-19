SUMMARY = "Performance Co-Pilot (PCP) metrics for Sendmail"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Sendmail traffic."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "pcp-pmda-sendmail-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "edd9f39f66b8629a3eee3e1d5851df59f2a89821d6edd7ab9f7030e00bbbb324e33aca00db9bb3bd998d4f923a8e47bc1b4b07cbe29e3c9f7b74c825b5edf6e9"

RPROVIDES:${PN} += "pcp-pmda-sendmail"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
pcp"

inherit rpm
