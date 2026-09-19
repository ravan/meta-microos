SUMMARY = "Synproxy stats plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor Synproxy stats."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-synproxy-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "87c364d1cac594ada7e03970e4f3b9d2b068f52736353740352a9391b4089cebbdfcb09728243f0b11479586a0c9281635564fd082e67f32d91491a9f431877a"

RPROVIDES:${PN} += "collectd-plugin-synproxy"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
