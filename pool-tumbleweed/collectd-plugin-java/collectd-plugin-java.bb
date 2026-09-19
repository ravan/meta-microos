SUMMARY = "Java API for collectd"
DESCRIPTION = "Optional collectd Java API in order to write collectd plugins in \
Java."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-java-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "62bfdfa7820f1950dc9a0bd80dc3d6f8bbe733bf6292a9723e3ccfbaaeaf0089e5da51695dea0187676d3c2328b53aa41c057c4e69fbcbc7b38533e9c9d1e0dd"

RPROVIDES:${PN} += "collectd-plugin-java"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjvm.so"

inherit rpm
