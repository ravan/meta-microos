SUMMARY = "Council of Science Editors (CSE) style file for BibLaTeX"
DESCRIPTION = "This is a BibLaTeX style that implements the bibliography style \
of the Council of Science Editors (CSE) for BibLaTeX. I did \
this style file by request of a user of my LaTeX template \
novathesis. He was quite thorough, double and triple checking \
that the output was conforming to the requirements of his \
University (Faculty of Veterinary from the University of \
Lisbon). Although this biblatex-cse style served the \
requirements from his University, there may still be some \
unconformities to the CSE style. If you find any, please open \
an issue in the project's page on GitHub or, even better, \
submit a pull request."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn76777"

RPM_NAME = "texlive-biblatex-cse-2026.226.2.0.0svn76777-61.2.noarch.rpm"
RPM_HASH = "ea36f85f72df4b2fc22a02b12d6e126520ef4fdeeff7314d501bf4b5afffbb18cca1c654a4914f0dcdeac75a92cd5d91934a700d3c7e946068831397af902636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-cse.bbx \
tex-biblatex-cse.cbx \
texlive-biblatex-cse"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear.cbx \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
