SUMMARY = "Development files for libasn1c, Osmocom's ASN.1 decoder and encoder library"
DESCRIPTION = "Compiles ASN.1 data structures into C source structures that can be \
simply (un)marshalled from and to: BER, DER, CER, BASIC-XER, CXER, \
EXTENDED-XER, PER. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libasn1c."
LICENSE = "BSD-2-Clause"

PV = "0.9.38"

RPM_NAME = "libasn1c-devel-0.9.38-1.7.aarch64.rpm"
RPM_HASH = "1fa9bf4b30135d393c4153923c269ba3bf44d17570e475227485b61ad54b0805738225526709776224265641fd9818af91d5b5f3b9c4890ecddf5646eadf7f89"

RPROVIDES:${PN} += "libasn1c-devel \
pkgconfig-libasn1c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libasn1c1 \
pkgconfig-talloc"

inherit rpm
