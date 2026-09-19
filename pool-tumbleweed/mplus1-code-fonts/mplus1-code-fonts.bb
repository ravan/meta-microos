SUMMARY = "Non-variable M PLUS 1 Code font"
DESCRIPTION = "7 weights from Thin to Bold. A monospaced font combining \
full-width Japanese glyphs (shared with M PLUS 1) and half-width \
alphanumeric glyphs (shared with M PLUS Code Latin 50 described below)."
LICENSE = "OFL-1.1"

PV = "20260325"

RPM_NAME = "mplus1-code-fonts-20260325-1.2.noarch.rpm"
RPM_HASH = "c037c326914696ceb3ffbca3f21e9882d7c5594b920ac9579aceb54eebc39a1ff4641c3a289cbee0930f5b0740cc03d0cddd2e03b158714f6a4687a3bca02b69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus1-code-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
