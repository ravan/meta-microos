SUMMARY = "Nomad Jukebox API"
DESCRIPTION = "Nomad Jukebox API"
LICENSE = "BSD-3-Clause"

PV = "2.2.7"

RPM_NAME = "libnjb5-2.2.7-113.3.aarch64.rpm"
RPM_HASH = "3e011208d8521c0dc2ccc631d3a4b67c31e61425a0031dd75e35f096fe76316acaa75ba6e97b769c68b4545ed89d1a8752829a6a48182b3f75856760356f4b0f"

RPROVIDES:${PN} += "libnjb.so.5 \
libnjb5"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libnjb \
libusb-0.1.so.4"

inherit rpm
