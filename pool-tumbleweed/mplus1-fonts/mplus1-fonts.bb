SUMMARY = "Non-variable M PLUS 1 Sans Serif font"
DESCRIPTION = "M PLUS 1 is a Sans Serif font with 9 weights from Thin to Black, \
supporting GF Latin Plus glyph set with 5,700+ Kanjis for Japanese."
LICENSE = "OFL-1.1"

PV = "20260325"

RPM_NAME = "mplus1-fonts-20260325-1.2.noarch.rpm"
RPM_HASH = "333de14fbf5895291ccf50ec1ae0f4b0b37bcdf7a341a845d7ca8a4e648300e1fccc91ebe019938d87f3dc618c6d9a4296b6652d26b00671eb528dcc8a10329e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
