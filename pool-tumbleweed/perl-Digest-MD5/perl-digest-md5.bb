SUMMARY = "Perl interface to the MD-5 algorithm"
DESCRIPTION = "The 'Digest::MD5' module allows you to use the RSA Data Security Inc. MD5 \
Message Digest algorithm from within Perl programs. The algorithm takes as \
input a message of arbitrary length and produces as output a 128-bit \
'fingerprint' or 'message digest' of the input. \
 \
Note that the MD5 algorithm is not as strong as it used to be. It has since \
2005 been easy to generate different messages that produce the same MD5 \
digest. It still seems hard to generate messages that produce a given \
digest, but it is probably wise to move to stronger algorithms for \
applications that depend on the digest to uniquely identify a message. \
 \
The 'Digest::MD5' module provide a procedural interface for simple use, as \
well as an object oriented interface that can handle messages of arbitrary \
length and which can read files directly."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.590.0"

RPM_NAME = "perl-Digest-MD5-2.590.0-2.14.aarch64.rpm"
RPM_HASH = "be07fd9d1e069cec2d97332f94947ac414ed9c977d3febde9c26cb36bdc3524a880ca2899ecf7b17be29e69363f1f4d506ef6fc556a7536702fb4b2589e3205b"

RPROVIDES:${PN} += "perl-Digest--MD5 \
perl-Digest-MD5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
