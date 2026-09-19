SUMMARY = "Machine Check Exceptions plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor machine check exceptions."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-mcelog-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "c304f1861291bf6b5816ea8a03b9d549a1717b4dd8224296188c49aba7fa7b643b3e9355ebdbd9bc313a002a52846a39a3d6eae748506a5b9ce119977f7c4f56"

RPROVIDES:${PN} += "collectd-plugin-mcelog"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
