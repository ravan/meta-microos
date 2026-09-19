SUMMARY = "Write Stackdriver plugin for collectd"
DESCRIPTION = "Optional collectd plugin to to write to Google Stackdriver."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-write_stackdriver-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "801a8d49bfe2c0344c8dc86ccb32784eeb0e4e03636f7c57d330069b3c15aba7be1f249297d2190010af53d2f219d5232ea356abec0304728b73a2b6042e52f3"

RPROVIDES:${PN} += "collectd-plugin-write-stackdriver"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libyajl.so.2"

inherit rpm
