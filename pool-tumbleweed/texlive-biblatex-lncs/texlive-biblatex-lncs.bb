SUMMARY = "BibLaTeX style for Springer Lecture Notes in Computer Science"
DESCRIPTION = "This is a BibLaTeX style for Springer Lecture Notes in Computer \
Science (LNCS). It extends the standard BiBTeX model by an \
acronym entry."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn67053"

RPM_NAME = "texlive-biblatex-lncs-2026.226.0.0.7svn67053-61.2.noarch.rpm"
RPM_HASH = "8cd22767262b0813de5d238655231e1a62523521bb114707be2b0e329b9959c12a60dd5d99f12b89813b5898d2226708d27868b3266dcb54a2f7a0fb73a37945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lncs.bbx \
tex-lncs.cbx \
texlive-biblatex-lncs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric.bbx \
tex-numeric.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
