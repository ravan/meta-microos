SUMMARY = "ASN.1 library for TCAP protocol (SS7)"
DESCRIPTION = "A TCAP message decoding library."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.0"

RPM_NAME = "libosmo-asn1-tcap1-0.3.0-1.1.aarch64.rpm"
RPM_HASH = "15d8dc7380f52a9d597ac40923ecd2cba33d832646f86f3962e9eb0d6c913d13e618bcfdac9a830e3e368e483f3a1cb361eb9c746d02507a718e55aa6b4f4d25"

RPROVIDES:${PN} += "libosmo-asn1-tcap.so.1 \
libosmo-asn1-tcap1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtalloc.so.2"

inherit rpm
