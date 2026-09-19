SUMMARY = "Civil engineering diagrams, using PSTricks"
DESCRIPTION = "This PSTricks-based package provides facilities to draw \
structural schemes in civil engineering analysis, for beams, \
portals, arches and piles."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.13svn38613"

RPM_NAME = "texlive-pst-stru-2026.226.0.0.13svn38613-60.4.noarch.rpm"
RPM_HASH = "c77440eb479ef15e9868f0c6dd4ad0ba0913e8ade17bb1387a2fc38cba2c99313aec7addf4ed1bdc8f9c4ac176b7fe0b32e7fade4ddfa555fcf47068ecf52603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-stru.sty \
tex-pst-stru.tex \
texlive-pst-stru"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
