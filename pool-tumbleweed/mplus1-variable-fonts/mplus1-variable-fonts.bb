SUMMARY = "Variable M PLUS 1 Sans Serif font"
DESCRIPTION = "M PLUS 1 is a Sans Serif variable font, supporting GF Latin Plus \
glyph set with 5,700+ Kanjis for Japanese."
LICENSE = "OFL-1.1"

PV = "20260325"

RPM_NAME = "mplus1-variable-fonts-20260325-1.2.noarch.rpm"
RPM_HASH = "84ad989b737cd8dd0e9b8a566334520ea007fb4c56c3df996148d08da75bcb177d2e047dfe568f4a35f072eb7f252e0c72b55d86c16ac69a58bc9d096ed250e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus1-variable-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
