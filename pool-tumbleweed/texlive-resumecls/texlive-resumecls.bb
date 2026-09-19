SUMMARY = "Typeset a resume both in English and Chinese"
DESCRIPTION = "A LaTeX document class to typeset a resume or CV both in \
English and Chinese with more ease and flexibility."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.1svn54815"

RPM_NAME = "texlive-resumecls-2026.226.0.0.4.1svn54815-60.4.noarch.rpm"
RPM_HASH = "d3756decc53dffc26e5a6c8884e3f54b9381d1bc745658564f1fee611a0fc0306531354d5ec0da4cb28a27d84d546e397f9a6623cfd020f5872a08ae1a854641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-resumecls.cls \
texlive-resumecls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-ctexart.cls \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-natbib.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
