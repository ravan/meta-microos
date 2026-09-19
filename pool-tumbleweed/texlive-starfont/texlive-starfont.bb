SUMMARY = "The StarFont Sans astrological font"
DESCRIPTION = "The package contains StarFontSans and StarFontSerif, two \
public-domain astrological fonts designed by Anthony I.P. Owen, \
and the appropriate macros to use them with TeX and LaTeX. The \
fonts are supplied both in the original TrueType Format and in \
Adobe Type 1 format."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.2svn19982"

RPM_NAME = "texlive-starfont-2026.226.1.2svn19982-64.2.noarch.rpm"
RPM_HASH = "160f1ed87808c0e80affea5c3ee9dd271afce7d4ddca01ac6694043e7c11d3225aedd1e332370a91917e49ec6c2a6b5783f0945354ca7990a155fb808fff004b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fstr8x.tfm \
tex-fsts8x.tfm \
tex-starfont.map \
tex-starfont.sty \
texlive-starfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-starfont-fonts"

inherit rpm
