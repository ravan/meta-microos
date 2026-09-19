SUMMARY = "Sysevent plugin for collectd"
DESCRIPTION = "Optional collectd plugin to listen to rsyslog events and submit matched values. \
."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-sysevent-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "7e0c251d94e8bed4929dea538fa42c3b27e0eac1e036f6c905bf744d239758a3e2652e9f2bca094b2acf57a23e1534877a193b0525b7d4d95626736ac2e08c93"

RPROVIDES:${PN} += "collectd-plugin-sysevent"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl.so.2"

inherit rpm
