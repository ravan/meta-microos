SUMMARY = "Adaptable BibTeX styles"
DESCRIPTION = "A family of modifications of the standard BibTeX styles whose \
behaviour may be changed by changing the user document, without \
change to the styles themselves. The package is largely used \
nowadays in its adaptation for working with Babel."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-abstyles-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "14cdda21ca45f7fff2a1774d053f5c9a924368fb38581b9ee5dc5ebe9388ea32e2eeb0e2418db40a1ed2093d2780dd4c7ce97b0e3bf8bf755aabdff7ad8251c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apreambl.tex \
texlive-abstyles"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
