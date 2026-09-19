SUMMARY = "Document class for dissertations at the University of Wollongong"
DESCRIPTION = "A document class for higher degree research theses in \
compliance with the specifications of University of Wollongong \
(UoW) theses in the 'Guidelines for Preparation and Submission \
of Higher Degree Research Theses' (March 2006), by the Research \
Student Centre, Research & Innovation Division, UoW."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn19700"

RPM_NAME = "texlive-uowthesis-2026.226.1.0asvn19700-60.2.noarch.rpm"
RPM_HASH = "56af209af96c6942dd13a70bb0123fbd7424fcd8595ff0fd84850c21e1c4271b80e8363bd3b25f2c98599bcc98d47b6f53e03d9ac2e57dead16f9827f13b6945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-UoWthesis.cls \
texlive-uowthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-nextpage.sty \
tex-report.cls \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
