SUMMARY = "VISL Constraint Grammar implementation"
DESCRIPTION = "Constraint Grammar (CG) is a methodological paradigm for natural \
language processing (NLP). Linguist-written, context dependent rules \
are compiled into a grammar that assigns grammatical tags \
('readings') to words or other tokens in running text."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later & MIT"

PV = "1.5.1"

RPM_NAME = "cg3-1.5.1-1.7.aarch64.rpm"
RPM_HASH = "760bc6e60bed5454bd25d631b30c6b68958d7cf8cdcbb15f3f103a96984591bccb3839488e73bbeb9895de9f53f91793a072e905f2397e829b8aad78a25c8a1f"

RPROVIDES:${PN} += "cg3"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcg3.so.1 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libstdc++.so.6 \
perl-Digest--SHA1 \
perl-File--Spec \
perl-Getopt--Long"

inherit rpm
