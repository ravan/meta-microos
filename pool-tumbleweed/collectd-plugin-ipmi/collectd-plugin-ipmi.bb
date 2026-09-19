SUMMARY = "OpenIPMI Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor sensors using the OpenIPMI \
library for IPMI enabled systems."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-ipmi-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "e5e3b6d89e04af98a513d0af1ff72aa35998889153124232cef290a912c2f826ea99c7c91c18aa2ee4f5c3815bafd6ca1198af89f7d20dce92e59211de12613b"

RPROVIDES:${PN} += "collectd-plugin-ipmi"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libOpenIPMI.so.0 \
libOpenIPMIpthread.so.0 \
libc.so.6"

inherit rpm
