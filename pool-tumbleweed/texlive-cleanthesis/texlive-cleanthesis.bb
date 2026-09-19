SUMMARY = "A clean LaTeX style for thesis documents"
DESCRIPTION = "The package offers a clean, simple, and elegant LaTeX style for \
thesis documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.0svn51472"

RPM_NAME = "texlive-cleanthesis-2026.226.0.0.4.0svn51472-60.2.noarch.rpm"
RPM_HASH = "dda99ab1994fac318044c17589102918eb6bbd5d1a947fdc5b63fc51a83ca240ef2767c5346d240264349083c021b62ca3b36d97c4ff2f98ee1f5cf0a73bd671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cleanthesis.sty \
texlive-cleanthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-blindtext.sty \
tex-charter.sty \
tex-enumitem.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-microtype.sty \
tex-scrlayer-scrpage.sty \
tex-setspace.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-tgheros.sty \
tex-tocloft.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
