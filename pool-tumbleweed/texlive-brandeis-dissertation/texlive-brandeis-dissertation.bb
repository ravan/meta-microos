SUMMARY = "Class for Brandeis University dissertations"
DESCRIPTION = "The class will enable the user to typeset a dissertation which \
adheres to the formatting guidelines of Brandeis University \
Graduate School of Arts and Sciences (GSAS)."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.14svn67935"

RPM_NAME = "texlive-brandeis-dissertation-2026.226.3.14svn67935-59.2.noarch.rpm"
RPM_HASH = "adc27364fe761cdd4ae489b83206a8e8708b3416ecc14b17a248a98f6a3de1661914b4c8852f2ca699b7f13210ff02a0ae036c07a1a57f89c3541eb61e99cc76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-brandeis-dissertation.cls \
texlive-brandeis-dissertation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-book.cls \
tex-csquotes.sty \
tex-geometry.sty \
tex-inputenc.sty \
tex-setspace.sty \
tex-titlesec.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
