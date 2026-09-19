SUMMARY = "ASN.1 parsing library"
DESCRIPTION = "This is the ASN.1 library used by GNUTLS. Abstract Syntax Notation One (ASN.1) \
is a standardized data description and serialization language."
LICENSE = "LGPL-2.1-or-later"

PV = "4.21.0"

RPM_NAME = "libtasn1-6-4.21.0-1.5.aarch64.rpm"
RPM_HASH = "33d24f8fd989068cf21db53bd8484bf7c839417e816d8dc0b21b476bb415b99a6ac07ffc137660b7c9bdc6419ac09437285045b58b6b92c115952f3f04785d66"

RPROVIDES:${PN} += "libtasn1-6 \
libtasn1.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
