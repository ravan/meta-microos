SUMMARY = "Perl bindings for OpenSSL and LibreSSL"
DESCRIPTION = "This module provides Perl bindings for libssl (an SSL/TLS API) and \
libcrypto (a cryptography API)."
LICENSE = "Artistic-2.0"

PV = "1.960.0"

RPM_NAME = "perl-Net-SSLeay-1.960.0-1.4.aarch64.rpm"
RPM_HASH = "59c07d273e0d2518e311bb1efb044f3406891eda07206b570f113af767676670a8276fefc128f7cb134ba2301306ab1e3c744845a1811229780008996ce35518"

RPROVIDES:${PN} += "perl-Net--SSLeay \
perl-Net--SSLeay--Handle \
perl-Net-SSLeay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
