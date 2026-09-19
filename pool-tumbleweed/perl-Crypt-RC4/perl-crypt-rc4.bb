SUMMARY = "Perl implementation of the RC4 encryption algorithm"
DESCRIPTION = "A simple implementation of the RC4 algorithm, developed by RSA Security, Inc. \
Here is the description from RSA's website: \
 \
RC4 is a stream cipher designed by Rivest for RSA Data Security (now RSA \
Security). It is a variable key-size stream cipher with byte-oriented \
operations. The algorithm is based on the use of a random permutation. Analysis \
shows that the period of the cipher is overwhelmingly likely to be greater than \
10100. Eight to sixteen machine operations are required per output byte, and \
the cipher can be expected to run very quickly in software. Independent \
analysts have scrutinized the algorithm and it is considered secure."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "2.02"

RPM_NAME = "perl-Crypt-RC4-2.02-14.7.aarch64.rpm"
RPM_HASH = "41ea32df3dc0ec52e60153fadee7c3f6bd775d654cf2c17332aa729b6763467ac9f4352ceab8d1ec62086a39c09c7bb72c178e8c938b3a5b2aa942fe161368be"

RPROVIDES:${PN} += "perl-Crypt--RC4 \
perl-Crypt-RC4"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
