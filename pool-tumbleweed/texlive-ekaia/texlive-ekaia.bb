SUMMARY = "Article format for publishing the Basque Country Science and Technology Journal 'Ekaia'"
DESCRIPTION = "The package provides the article format for publishing the \
Basque Country Science and Technology Journal 'Ekaia' at the \
University of the Basque Country."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.06svn49594"

RPM_NAME = "texlive-ekaia-2026.226.1.06svn49594-61.4.noarch.rpm"
RPM_HASH = "d2026f6001cc924afc447ccc47cd8c2279028ad8e3f5f3378d2f21894c0d5cef7e81c426f843537aea4d0368ba17b24d0d378f61caedc83028d87957b317a5c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ekaia.sty \
texlive-ekaia"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-basque-date.sty \
tex-ccicons.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-indentfirst.sty \
tex-sectsty.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
