SUMMARY = "OpenSSL/LibreSSL pseudo-random number generator access"
DESCRIPTION = "'Crypt::OpenSSL::Random' provides the ability to seed and query the \
*OpenSSL* and *LibreSSL* library's pseudo-random number generators. \
 \
Note: On *LibreSSL* 'random_egd()' is not defined."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.170.0"

RPM_NAME = "perl-Crypt-OpenSSL-Random-0.170.0-1.14.aarch64.rpm"
RPM_HASH = "5166509cdddded02aecc1ac2f8bddae8d76e74451e03b2329c7254137a2b20e6568447b156a3a9380510c92abe9a4b6d20b1f9532d6ae82538ccf9414f526a83"

RPROVIDES:${PN} += "perl-Crypt--OpenSSL--Random \
perl-Crypt-OpenSSL-Random"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
