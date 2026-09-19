SUMMARY = "Header files for the Osmocom ASN.1-TCAP library"
DESCRIPTION = "Header files for a TCP message decoding library."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.0"

RPM_NAME = "libosmo-asn1-tcap-devel-0.3.0-1.1.aarch64.rpm"
RPM_HASH = "2ac50877af1ea4d9da3f05d2471d5d89e93f29f21216f219e24cb1db5460b8b8fe8fc7e85d19bd59476347069040598eeb94c5013d2394de41486d23804d73c5"

RPROVIDES:${PN} += "libosmo-asn1-tcap-devel \
pkgconfig-libosmo-asn1-tcap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-asn1-tcap1 \
pkgconfig-talloc"

inherit rpm
