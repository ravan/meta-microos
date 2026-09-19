SUMMARY = "Typeset mathematical double stroke symbols"
DESCRIPTION = "A font based on Computer Modern Roman useful for typesetting \
the mathematical symbols for the natural numbers (N), whole \
numbers (Z), rational numbers (Q), real numbers (R) and complex \
numbers (C); coverage includes all Roman capital letters, '1', \
'h' and 'k'. The font is available both as Metafont source and \
in Adobe Type 1 format, and LaTeX macros for its use are \
provided. The fonts appear in the blackboard bold sampler."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.111svn77682"

RPM_NAME = "texlive-doublestroke-2026.226.1.111svn77682-59.2.noarch.rpm"
RPM_HASH = "547beb0259ac9565f5a1a5405bbd2471e5b6c7824bcd721aa11c68fe8b97afa99aae93589100f718d09e742aeb7859ce5ade35006bff610083f8e61bf1992ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Udsrom.fd \
tex-Udsss.fd \
tex-dsfont.sty \
tex-dsrom10.tfm \
tex-dsrom12.tfm \
tex-dsrom8.tfm \
tex-dsss10.tfm \
tex-dsss12.tfm \
tex-dsss8.tfm \
tex-dstroke.map \
texlive-doublestroke"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-doublestroke-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
