SUMMARY = "Memcache Daemon Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to sample memcached statistics."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-memcachec-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "ee0ce26a45681fa05c7ac38a244c4d8049fe826a78b3b698c9a35be94b9dca353cdbdcdaf81b1ede461d2dc52fa24a43c5c733ba9908f9491fc03ccd341abeac"

RPROVIDES:${PN} += "collectd-plugin-memcachec"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmemcached.so.11"

inherit rpm
