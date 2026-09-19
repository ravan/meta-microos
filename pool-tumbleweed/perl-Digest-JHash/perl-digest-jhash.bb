SUMMARY = "Perl extension for 32 bit Jenkins Hashing Algorithm"
DESCRIPTION = "The 'Digest::JHash' module allows you to use the fast JHash hashing \
algorithm developed by Bob Jenkins from within Perl programs. The algorithm \
takes as input a message of arbitrary length and produces as output a \
32-bit 'message digest' of the input in the form of an unsigned long \
integer. \
 \
Call it a low calorie version of MD5 if you like. \
 \
See http://burtleburtle.net/bob/hash/doobs.html for more information."
LICENSE = "Artistic-2.0"

PV = "0.10"

RPM_NAME = "perl-Digest-JHash-0.10-1.51.aarch64.rpm"
RPM_HASH = "b79923767c64a0f9d81284cc0ccdeefd6dbb69864dff3590d3ead7d7d0de07daf9137d3e7319183dce648c30423a2c73710c6190bd08751a6c74f4de9f9f8e2a"

RPROVIDES:${PN} += "perl-Digest--JHash \
perl-Digest-JHash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
