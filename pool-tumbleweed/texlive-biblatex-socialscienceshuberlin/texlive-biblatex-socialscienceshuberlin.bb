SUMMARY = "BibLaTeX-style for the social sciences at HU Berlin"
DESCRIPTION = "This is a BibLaTeX style for the social sciences at the \
Humboldt-Universitat zu Berlin."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.1svn76790"

RPM_NAME = "texlive-biblatex-socialscienceshuberlin-2026.226.0.0.0.1svn76790-61.2.noarch.rpm"
RPM_HASH = "37e4c49437e31e0b490e3db937975718b2707d1ac30a3b9558bc4a3cc2126ea385313e528af1f8de71144cf5fd23d1d11ef40f09510feb831915839e278a33e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-german-socialscienceshuberlin.lbx \
tex-socialscienceshuberlin.bbx \
tex-socialscienceshuberlin.cbx \
texlive-biblatex-socialscienceshuberlin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ext-authoryear.bbx \
tex-ext-authoryear.cbx \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
