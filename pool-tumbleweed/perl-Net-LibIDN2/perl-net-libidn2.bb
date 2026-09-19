SUMMARY = "Perl bindings for GNU Libidn2"
DESCRIPTION = "Provides bindings for GNU Libidn2, a C library for handling \
internationalized domain names based on IDNA 2008, Punycode and TR46."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-Net-LibIDN2-1.02-1.20.aarch64.rpm"
RPM_HASH = "4f27b3115cde60766926b9d338e9670880728ea888fa9cac03d6841f0178bead614d0a57c16ce87cf85d2ca45a4e6a65b5698a122f844b58b251c70cad7f5a9b"

RPROVIDES:${PN} += "perl-Net--LibIDN2 \
perl-Net-LibIDN2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libidn2.so.0 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
