SUMMARY = "Perl DES encryption module"
DESCRIPTION = "The module implements the Crypt::CBC interface, which has the following \
methods \
 \
* blocksize \
 \
* keysize \
 \
* encrypt \
 \
* decrypt"
LICENSE = "BSD-3-Clause"

PV = "2.90.0"

RPM_NAME = "perl-Crypt-DES-2.90.0-1.1.aarch64.rpm"
RPM_HASH = "e64eb2ef04ebc538f7fd4c0c26715b9880f2137c03a7f2827e7588026d7fd5f0ae00b0dd39426c74873bbd5506e2084cbaba4f9cab31d5df06265b3eb179cbdc"

RPROVIDES:${PN} += "perl-Crypt--DES \
perl-Crypt-DES"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
