SUMMARY = "Network UPS Tools plugin for collectd"
DESCRIPTION = "This plugin for collectd provides Network UPS Tools support."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-nut-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "7e108e7f0b2869c171b781c73330b2c4a467de7d2e76f9eebf9f44df3d7212df5c9725ef9f013c1d5aa9068467c5ebddef5c57d940f2e3e6af8c5e8ce7dce4b2"

RPROVIDES:${PN} += "collectd-plugin-nut"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libupsclient.so.7"

inherit rpm
