SUMMARY = "Development files for the VISL Constraint Grammar library"
DESCRIPTION = "Constraint Grammar (CG) is a methodological paradigm for natural \
language processing (NLP). Linguist-written, context dependent rules \
are compiled into a grammar that assigns grammatical tags \
('readings') to words or other tokens in running text. \
 \
This subpackage contains the files needed to build programs \
that want to use VISL CG-3."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "cg3-devel-1.5.1-1.7.aarch64.rpm"
RPM_HASH = "85babb5520b42fb0ed709ab133c37da4f2c6285c01884d82fb0b28b5a1b843121bb62f901d9c55c4adaa593a9335702618fb4d1f45e230ec8739a89e437ec28d"

RPROVIDES:${PN} += "cg3-devel \
pkgconfig-cg3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcg3-1"

inherit rpm
