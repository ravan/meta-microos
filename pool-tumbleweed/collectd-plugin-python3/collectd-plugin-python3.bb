SUMMARY = "Python3 API for collectd"
DESCRIPTION = "Optional collectd Python3 API in order to write collectd plugins in \
Python3."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.382.g2cd055fe"

RPM_NAME = "collectd-plugin-python3-5.12.0.382.g2cd055fe-3.1.aarch64.rpm"
RPM_HASH = "7a8910dd0bbbfb539c4d7713beed371882d1b1bd5aaaa701fe82c2f8f2ec5a6025ba6c30fcf5bbb1071f29d3daf0e46dd3dfe2c15c731e644d4f16ca35c1a20f"

RPROVIDES:${PN} += "collectd-plugin-python3"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0"

inherit rpm
