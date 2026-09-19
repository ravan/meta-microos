SUMMARY = "Computer Science thesis class for University of Dortmund"
DESCRIPTION = "At the department of computer science at the University of \
Dortmund there are cardboard cover pages for research or \
internal reports like master/phd-theses. The main function of \
this LaTeX2e document-class is a replacement for the \\maketitle \
command to typeset a title page that is adjusted to these cover \
pages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2msvn21340"

RPM_NAME = "texlive-fbithesis-2026.226.1.2msvn21340-59.2.noarch.rpm"
RPM_HASH = "e63d3adde41039b58f157cb54182f0654c539d98ded46004a17eb424c528aefef275a4bb5bb4afb0219bdc74bf84cd38ca8c1806ada5ce1f24e4b80faa43f583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fbithesis.cfg \
tex-fbithesis.cls \
texlive-fbithesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
