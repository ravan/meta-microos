SUMMARY = "Non-variable M PLUS 2 Sans Serif font"
DESCRIPTION = "M PLUS 2 is a Sans Serif font with 9 weights from Thin to Black, \
supporting GF Latin Plus glyph set with 5,700+ Kanjis for Japanese."
LICENSE = "OFL-1.1"

PV = "20260325"

RPM_NAME = "mplus2-fonts-20260325-1.2.noarch.rpm"
RPM_HASH = "55534ac70b2178a311ca1242782edbfc89803b403bcd77ba8f25414c553ca23383a44e45cdf1137638646ee5e76d75bd1ae7a1f87c11ab213932718e21c605bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus2-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
