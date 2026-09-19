SUMMARY = "Write Syslog plugin for collectd"
DESCRIPTION = "Optional collectd plugin to write values lists as syslog messages."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-write_syslog-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "2b8b0921b0720a9c2472fcd0fdcac68f8dda7db2ec1c5770c4c51cabc2677eb591d9d693e2f799b7d01962b66727d69a296e013eeea705f32602c08281b69d16"

RPROVIDES:${PN} += "collectd-plugin-write-syslog"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
