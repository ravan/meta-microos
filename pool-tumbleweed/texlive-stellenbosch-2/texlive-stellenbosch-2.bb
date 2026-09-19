SUMMARY = "Stellenbosch University thesis bundle"
DESCRIPTION = "Typesetting dissertations, theses and reports as well as \
presentations of Stellenbosch University, South Africa. Note: \
The previous version, stellenbosch, is still available for \
legacy documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn68183"

RPM_NAME = "texlive-stellenbosch-2-2026.226.2.0svn68183-64.2.noarch.rpm"
RPM_HASH = "3fc17f93b7a5849f725b0af571f00cce1f4ddd209ba7376fc3b9124c3d8be42dae3f8ffcb489489ef6a5dad41f44c507fcc204cad4316070636426ab30dda424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stb-beamer-a.sty \
tex-stb-beamer-b.sty \
tex-stb-bib.sty \
tex-stb-nomencl.sty \
tex-stb-thesis.cls \
tex-stb-titlepage.sty \
texlive-stellenbosch-2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
