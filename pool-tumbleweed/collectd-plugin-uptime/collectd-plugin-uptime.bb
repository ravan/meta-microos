SUMMARY = "Uptime plugin for collectd"
DESCRIPTION = "Optional collectd plugin to collect system uptime statistics."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-uptime-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "00288ec12a260820bae9923d20e7fc782d76f904335f1ec4a761bb8d2c84305d0ddbb0e1242bc3074c5a249a017ba312981dde9f833e9d7004c09943c5219b37"

RPROVIDES:${PN} += "collectd-plugin-uptime"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
