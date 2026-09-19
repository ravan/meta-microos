SUMMARY = "Symbols for transformations"
DESCRIPTION = "The bundle provides Metafont source for a small font used for \
(e.g.) Laplace transformations, together with a LaTeX .fd file \
and a package providing commands for the symbols' use in \
mathematics."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn18732"

RPM_NAME = "texlive-trsym-2026.226.1.0svn18732-59.2.noarch.rpm"
RPM_HASH = "498917966f0bbf3259cc9862bc5c24cd36dc022180a2863df290989f9c72d237af8b5dc7b8cd0295691f3fea18d032113708916ef491cedce2f6b9abb1473746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trsy10.tfm \
tex-trsy12.tfm \
tex-trsym.sty \
tex-utrsy.fd \
texlive-trsym"

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
