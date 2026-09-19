SUMMARY = "MySQL Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor MySQL server instances."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-mysql-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "86f9b41451e7158febf35079f860a75bd06165e2d24583169d9420adc0da5fe4be367274cd8189f57d850bcdbd212ee04ff4d8faa42a8364af85623abce68003"

RPROVIDES:${PN} += "collectd-plugin-mysql"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb.so.3"

inherit rpm
