SUMMARY = "'Traditional' BibTeX styles with BibLaTeX"
DESCRIPTION = "The bundle provides implementations of the 'traditional' BibTeX \
styles (plain, abbrev, unsrt and alpha) with BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn77682"

RPM_NAME = "texlive-biblatex-trad-2026.226.0.0.5svn77682-61.2.noarch.rpm"
RPM_HASH = "62825f635d3dd21f4b94dff25b9ce3413a64ef4e2ab43da29f37a6f8f5e5af8a21b652ae7256f3316c0d990ee8315dcf4da41919aaec0e04235b27e2d3d73bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trad-abbrv.bbx \
tex-trad-abbrv.cbx \
tex-trad-alpha.bbx \
tex-trad-alpha.cbx \
tex-trad-plain.bbx \
tex-trad-plain.cbx \
tex-trad-standard.bbx \
tex-trad-standard.cbx \
tex-trad-unsrt.bbx \
tex-trad-unsrt.cbx \
texlive-biblatex-trad"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphabetic.cbx \
tex-numeric.cbx \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
