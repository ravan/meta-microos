SUMMARY = "OpenSSL support for LWP"
DESCRIPTION = "This Perl module provides support for the HTTPS protocol under LWP, to \
allow an LWP::UserAgent object to perform GET, HEAD, and POST requests over \
encrypted socket connections. Please see LWP for more information on POST \
requests. \
 \
The 'Crypt::SSLeay' package provides 'Net::SSL', which, if requested, is \
loaded by 'LWP::Protocol::https' for https requests and provides the \
necessary SSL glue."
LICENSE = "Artistic-2.0"

PV = "0.72"

RPM_NAME = "perl-Crypt-SSLeay-0.72-5.15.aarch64.rpm"
RPM_HASH = "a1229f963550b7c12071bcf78195bea8d41727ce5af767be3b7284572352d39ba4d67678290f85739c4046fa2c035687c85c5aa4ffd10e6e508fcdb5c31517b9"

RPROVIDES:${PN} += "perl-Crypt--SSLeay \
perl-Crypt--SSLeay--CTX \
perl-Crypt--SSLeay--Conn \
perl-Crypt--SSLeay--Err \
perl-Crypt--SSLeay--MainContext \
perl-Crypt--SSLeay--Version \
perl-Crypt--SSLeay--X509 \
perl-Crypt-SSLeay \
perl-DB \
perl-Net--SSL"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
openssl \
perl--MODULE-COMPAT-5.44.0 \
perl-LWP--Protocol--https"

inherit rpm
