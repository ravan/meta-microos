SUMMARY = "Severed fonts for texlive-lilyglyphs"
DESCRIPTION = "The  separated fonts package for texlive-lilyglyphs"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.4svn56473"

RPM_NAME = "texlive-lilyglyphs-fonts-2026.226.0.0.2.4svn56473-61.2.noarch.rpm"
RPM_HASH = "8072646be59f3681d8470bde8427cb842a7c23596f15cf6dd2376964e704cd4313fd7cdbec1fef75dec5b1bc776a37d5455c81895fa0d8ad0c42bc0232aa9eab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-emmentaler-11 \
font-emmentaler-13 \
font-emmentaler-14 \
font-emmentaler-16 \
font-emmentaler-18 \
font-emmentaler-20 \
font-emmentaler-23 \
font-emmentaler-26 \
font-emmentaler-brace \
texlive-lilyglyphs-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
