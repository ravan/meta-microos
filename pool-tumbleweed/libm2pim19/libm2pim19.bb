SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "14.4.0+git12698"

RPM_NAME = "libm2pim19-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "72ff4d2ecb08ffa7cf0cb141f63b940e6c0452b6bd8d9938810378c4550c7406e280991ed2ccb808e71006582f4179a762ef75c2af5a77772ee5a9a2c4fef88b"

RPROVIDES:${PN} += "libm2pim.so.19 \
libm2pim19"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
