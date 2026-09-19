SUMMARY = "Osmocon ASN.1 decoder and encoder library"
DESCRIPTION = "Lev Walkins's asn1c runtime, as a shared library and with \
modifications for Osmocom. \
 \
Compiles ASN.1 data structures into C source structures that can be \
simply (un)marshalled from and to: BER, DER, CER, BASIC-XER, CXER, \
EXTENDED-XER, PER."
LICENSE = "BSD-2-Clause"

PV = "0.9.38"

RPM_NAME = "libasn1c1-0.9.38-1.7.aarch64.rpm"
RPM_HASH = "635f6ea01da6696f56c83848b6d10c89865cc5d18069100cb8069c0f06f2cb608e1f911651512df22aca91f794dd766d9218044e5fcd61306c92a979795f5da8"

RPROVIDES:${PN} += "libasn1c.so.1 \
libasn1c1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtalloc.so.2"

inherit rpm
