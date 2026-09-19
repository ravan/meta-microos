SUMMARY = "C library for generating TOTP and HOTP"
DESCRIPTION = "libcotp C library for generating TOTP and HOTP according to RFC-6238. \
It supports custom digits, (3 to 10) custom period (1 to 120 seconds) and \
also Steam TOTP format."
LICENSE = "Apache-2.0"

PV = "4.2.1"

RPM_NAME = "libcotp4-4.2.1-1.2.aarch64.rpm"
RPM_HASH = "0aca551dc89dc7c3b1579fdb291d62ef2b60ef2cd54a61ba254facd5e0b4d8e250b2a7d87d762f2dae34180d3ab370782ccbba6f9a361f6b6226c7c874f76b80"

RPROVIDES:${PN} += "libcotp.so.4 \
libcotp4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20"

inherit rpm
