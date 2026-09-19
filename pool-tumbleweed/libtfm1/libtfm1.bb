SUMMARY = "Large integer arithmetic library"
DESCRIPTION = "TomsFastMath is a large integer arithmetic library written in ISO C. It \
performs modular exponentiations and other related \
functions required for ECC, DH and RSA cryptosystems."
LICENSE = "SUSE-Public-Domain | WTFPL"

PV = "0.13.1"

RPM_NAME = "libtfm1-0.13.1-1.18.aarch64.rpm"
RPM_HASH = "3e7629c2e1a7a5797f3b61740beb7d04e5662bcdcabd64ddbda9e8297147c83116d6b256373dbda1dc009bbf4b2e21f51b060673c2672e9e5e44e16b4b837f74"

RPROVIDES:${PN} += "libtfm.so.1 \
libtfm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
