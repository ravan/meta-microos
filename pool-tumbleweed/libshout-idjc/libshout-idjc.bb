SUMMARY = "Modified version of libshout for Internet DJ Console"
DESCRIPTION = "Modified version of libshout for IDJC."
LICENSE = "LGPL-2.0-only"

PV = "2.4.6.r2"

RPM_NAME = "libshout-idjc-2.4.6.r2-1.4.aarch64.rpm"
RPM_HASH = "8c4e0c8a0359486298e9bd22a2b119dc8c8f6047122c68af594090fee006f60e0ce59d2b98b78823fdd2f71d0d826a183a213d1b01492fd3d73ab665d28ac3d9"

RPROVIDES:${PN} += "libshout-idjc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libshout-idjc.so.3"

inherit rpm
