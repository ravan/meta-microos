SUMMARY = "Typeset documents in Church Slavonic language using Unicode"
DESCRIPTION = "The package provides fonts, hyphenation patterns, and \
supporting macros to typeset Church Slavonic texts. It depends \
on the following other packages: fonts-churchslavonic, \
hyph-utf8, intcalc, etoolbox, and xcolor."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.4svn67474"

RPM_NAME = "texlive-churchslavonic-2026.226.0.0.2.4svn67474-60.2.noarch.rpm"
RPM_HASH = "d1b2b47ab563954a6f88e917cda175af8469fb6b00c2df4d8f361b110dedb850e008316a9418e61adc18eba024dcd6954c48e43b413b692201a9e1f6ec0b1e4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-churchslavonic.sty \
tex-cu-calendar.sty \
tex-cu-kinovar.sty \
tex-cu-kruk.sty \
tex-cu-num.sty \
tex-cu-util.sty \
tex-gloss-churchslavonic.ldf \
texlive-churchslavonic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifluatex.sty \
tex-intcalc.sty \
tex-keyval.sty \
tex-luacolor.sty \
tex-xcolor.sty \
texlive \
texlive-etoolbox \
texlive-filesystem \
texlive-fonts-churchslavonic \
texlive-hyphen-churchslavonic \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-oberdiek \
texlive-scripts \
texlive-scripts-bin \
texlive-xcolor"

inherit rpm
