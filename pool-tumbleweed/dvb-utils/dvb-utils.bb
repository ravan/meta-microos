SUMMARY = "Utilities for DVB devices"
DESCRIPTION = "dvb-utils is a collection of various DVB utilities."
LICENSE = "GPL-2.0-only"

PV = "1.32.0"

RPM_NAME = "dvb-utils-1.32.0-2.4.aarch64.rpm"
RPM_HASH = "dc94599f88b624c2c04e441176138821b67ba5ba1e17ecab0368d146a114f6db577c2b9599a36bcaeb69c44ba06c810a1be2fe23dc2f25f74103801e76c72498"

RPROVIDES:${PN} += "dvb-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdvbv5.so.0"

inherit rpm
