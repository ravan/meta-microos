SUMMARY = "ASN.1 Compiler"
DESCRIPTION = "Compiles ASN.1 data structures into C source structures that can be \
simply marshalled to/unmarshalled from: BER, DER, CER, BASIC-XER, \
CXER, EXTENDED-XER, PER."
LICENSE = "BSD-2-Clause"

PV = "0.9.29"

RPM_NAME = "asn1c-0.9.29-1.3.aarch64.rpm"
RPM_HASH = "cfe579aad6b81785ae118f585e90a8583518d7ec38c5994fda1e0378dda8b06beca126a617fb128d348ac45e950e10fc885b1e2c3ee8b1914aca8ca0baed75e6"

RPROVIDES:${PN} += "asn1c"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
