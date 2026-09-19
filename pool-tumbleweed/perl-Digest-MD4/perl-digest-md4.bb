SUMMARY = "Perl interface to the MD4 Algorithm"
DESCRIPTION = "The 'Digest::MD4' module allows you to use the RSA Data Security Inc. MD4 \
Message Digest algorithm from within Perl programs. The algorithm takes as \
input a message of arbitrary length and produces as output a 128-bit \
'fingerprint' or 'message digest' of the input. \
 \
The 'Digest::MD4' module provide a procedural interface for simple use, as \
well as an object oriented interface that can handle messages of arbitrary \
length and which can read files directly."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.900.0"

RPM_NAME = "perl-Digest-MD4-1.900.0-1.10.aarch64.rpm"
RPM_HASH = "121f958373ba84d65ac730896899fa359cbbd901949d331ea251e760ec4201c6de3be1b12787c28ad7f03616b3790a9831f2d687a05d1b5557876e7c8f07174d"

RPROVIDES:${PN} += "perl-Digest--MD4 \
perl-Digest-MD4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
