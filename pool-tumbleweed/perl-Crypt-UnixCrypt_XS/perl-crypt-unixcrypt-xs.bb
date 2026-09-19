SUMMARY = "Perl xs interface for a portable traditional  F<crypt> function."
DESCRIPTION = "This module implements the DES-based Unix _crypt_ function. For those who \
need to construct non-standard variants of _crypt_, the various building \
blocks used in _crypt_ are also supplied separately."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.110.0"

RPM_NAME = "perl-Crypt-UnixCrypt_XS-0.110.0-1.8.aarch64.rpm"
RPM_HASH = "da5fbaf8268545bc91578876da43717bd782069efab40cef4691ed75a595508807e87a65976ce62393edd9226405f7bc97a6070c680132935d834385acc72af8"

RPROVIDES:${PN} += "perl-Crypt--UnixCrypt-XS \
perl-Crypt-UnixCrypt-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
