SUMMARY = "OpenSSL's multiprecision integer arithmetic"
DESCRIPTION = "Crypt::OpenSSL::Bignum provides access to OpenSSL multiprecision integer \
arithmetic libraries. Presently, many though not all of the arithmetic \
operations that OpenSSL provides are exposed to perl. In addition, this \
module can be used to provide access to bignum values produced by other \
OpenSSL modules, such as key parameters from Crypt::OpenSSL::RSA. \
 \
_NOTE_: Many of the methods in this package can croak, so use eval, or \
Error.pm's try/catch mechanism to capture errors."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Crypt-OpenSSL-Bignum-0.09-1.45.aarch64.rpm"
RPM_HASH = "8928615b619a9a3393f5974e09eb6d3b596a322321e5f85ad2a3655a2747acb6214875773f82f8563a6bd2b773bb3282233f0b9060ab1cb345a0c4406b0eec55"

RPROVIDES:${PN} += "perl-Crypt--OpenSSL--Bignum \
perl-Crypt--OpenSSL--Bignum--CTX \
perl-Crypt-OpenSSL-Bignum"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
