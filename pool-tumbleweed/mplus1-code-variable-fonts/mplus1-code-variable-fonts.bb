SUMMARY = "Variable M PLUS 1 Code font"
DESCRIPTION = "A monospaced variable font combining full-width Japanese glyphs \
(shared with M PLUS 1) and half-width alphanumeric glyphs \
(shared with M PLUS Code Latin 50 described below)."
LICENSE = "OFL-1.1"

PV = "20260325"

RPM_NAME = "mplus1-code-variable-fonts-20260325-1.2.noarch.rpm"
RPM_HASH = "521163b8b9b67f87e51786504e76ab744c667ffa45e2c23403ae9e494c8273e05bdcfaedf4044c4755f6bb1a100db08c1bf9e9ea77fa24878c0a04eb86b7d6ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mplus1-code-variable-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
