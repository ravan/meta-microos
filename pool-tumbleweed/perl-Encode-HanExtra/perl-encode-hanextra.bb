SUMMARY = "Extra sets of Chinese encodings"
DESCRIPTION = "Perl 5.7.3 and later ships with an adequate set of Chinese encodings, \
including the most used CP950, CP936 (also known as GBK), Big5, \
Big5-HKSCS, EUC-CN, HZ, and ISO-IR-165. \
 \
However, the numbers of Chinese encodings are staggering, and a \
complete coverage will easily increase the size of perl distribution by \
several megabytes; hence, this CPAN module tries to provide the rest of \
them."
LICENSE = "MIT"

PV = "0.23"

RPM_NAME = "perl-Encode-HanExtra-0.23-90.14.aarch64.rpm"
RPM_HASH = "01beb5cf3fa694bd1b0bb5829bcdb5e78b80f18f5d1f5a263c0f63fe5cab098a6213a0b3e6290b27fda2eb8dc79b4334bfe84fb2847ac9c13da50ac2b1bccc49"

RPROVIDES:${PN} += "perl-Encode--HanExtra \
perl-Encode--TW--Unisys--SOSI1 \
perl-Encode--TW--Unisys--SOSI2 \
perl-Encode-HanExtra"

RDEPENDS:${PN} += "/usr/bin/enc2xs \
/usr/bin/sh \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
