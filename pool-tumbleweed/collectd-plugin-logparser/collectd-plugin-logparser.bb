SUMMARY = "Logparser plugin for collectd"
DESCRIPTION = "Optional collectd plugin for filtering and parsing logs."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-logparser-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "437fbc7d658cef7a7e95a97334d1e07ed065a7a9c3c94c1c243b4bdadd9cc773b55ddbf86a3ea037294f7c8d7673cdbed34e1617069eabb711bc4d8d62a58e69"

RPROVIDES:${PN} += "collectd-plugin-logparser"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
