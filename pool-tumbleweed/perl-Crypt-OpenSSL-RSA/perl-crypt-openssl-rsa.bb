SUMMARY = "RSA encoding and decoding, using the openSSL libraries"
DESCRIPTION = "'Crypt::OpenSSL::RSA' provides the ability to RSA encrypt strings which are \
somewhat shorter than the block size of a key. It also allows for \
decryption, signatures and signature verification. \
 \
_NOTE_: Many of the methods in this package can croak, so use 'eval', or \
Error.pm's try/catch mechanism to capture errors. Also, while some methods \
from earlier versions of this package return true on success, this (never \
documented) behavior is no longer the case."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.410.0"

RPM_NAME = "perl-Crypt-OpenSSL-RSA-0.410.0-1.4.aarch64.rpm"
RPM_HASH = "eb3669030f5b7294f02305ccee4717968ae4e237c841331143436819c6e2318f9d95277d674426b30f37c6b2c2ef5eef8d9a49db563dd2adf42c9e08b19af28e"

RPROVIDES:${PN} += "perl-Crypt--OpenSSL--RSA \
perl-Crypt-OpenSSL-RSA"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
perl--MODULE-COMPAT-5.44.0 \
perl-Crypt--OpenSSL--Bignum \
perl-Crypt--OpenSSL--Random"

inherit rpm
