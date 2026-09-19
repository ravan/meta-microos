SUMMARY = "Library implementing GTP between SGSN and GGSN"
DESCRIPTION = "libgtp implements the GPRS Tunneling Protocol between SGSN and GGSN."
LICENSE = "GPL-2.0-only"

PV = "1.15.0"

RPM_NAME = "libgtp11-1.15.0-1.1.aarch64.rpm"
RPM_HASH = "aa08251075d6b08e3ae0cb191663a61dfcf9a38d38d97cf96e6a8fabd021da7040ec1ca530d6a33690d96f5ad1578e506bdf977e16e38cf1896af7b6b8cd82a1"

RPROVIDES:${PN} += "libgtp.so.11 \
libgtp11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.22 \
libtalloc.so.2"

inherit rpm
