SUMMARY = "Perl interface to the SHA-1 algorithm"
DESCRIPTION = "The 'Digest::SHA1' module allows you to use the NIST SHA-1 message digest \
algorithm from within Perl programs. The algorithm takes as input a message \
of arbitrary length and produces as output a 160-bit 'fingerprint' or \
'message digest' of the input. \
 \
In 2005, security flaws were identified in SHA-1, namely that a possible \
mathematical weakness might exist, indicating that a stronger hash function \
would be desirable. The Digest::SHA module implements the stronger \
algorithms in the SHA family. \
 \
The 'Digest::SHA1' module provide a procedural interface for simple use, as \
well as an object oriented interface that can handle messages of arbitrary \
length and which can read files directly."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.130.0"

RPM_NAME = "perl-Digest-SHA1-2.130.0-1.8.aarch64.rpm"
RPM_HASH = "47c74a86e7d8a9666896c7a5944beff93a9c4454f05b18c83dbc4ff51e4e739cb4166d9e60158cdf39103dc244a6d1a438acde8124d3787449d0295f3761583d"

RPROVIDES:${PN} += "perl-Digest--SHA1 \
perl-Digest-SHA1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
