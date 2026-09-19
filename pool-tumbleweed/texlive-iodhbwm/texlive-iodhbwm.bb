SUMMARY = "Unofficial template of the DHBW Mannheim"
DESCRIPTION = "This package provides an unofficial template of the DHBW \
Mannheim for the creation of bachelor thesis, studies or \
project work with LaTeX. The aim of the package is the quick \
creation of a basic framework without much effort."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.2svn57773"

RPM_NAME = "texlive-iodhbwm-2026.226.1.2.2svn57773-60.2.noarch.rpm"
RPM_HASH = "4c4f7a09cae43d3bbfdb1ab0f152cd134f1e11ac7b9183f36dc88f994c1668cd75c2b8f8a7e0f12e12af88c93654c8c0db7523bc6c972bd8b0550f1696e01cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iodhbwm-i18n.def \
tex-iodhbwm-templates.sty \
tex-iodhbwm.cls \
texlive-iodhbwm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-auxhook.sty \
tex-babel.sty \
tex-blindtext.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-csquotes.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lipsum.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-pgfopts.sty \
tex-scrhack.sty \
tex-scrlfile.sty \
tex-setspace.sty \
tex-siunitx.sty \
tex-tabularx.sty \
tex-tcolorbox.sty \
tex-totalcount.sty \
tex-xcolor.sty \
tex-xpatch.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
