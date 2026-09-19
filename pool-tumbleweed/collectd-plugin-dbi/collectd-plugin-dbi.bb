SUMMARY = "DBI Storage Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to store sampling results into \
various databases as supported by libdbi."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-dbi-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "921e8bac459811895f80054ad36c9f2b3ed185d1688d4064d5ed6243db23eb1f0720ca54546110ee32a038471479f2a6e0d35c84fb2866a73347072d605e45ba"

RPROVIDES:${PN} += "collectd-plugin-dbi"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3"

inherit rpm
