SUMMARY = "Drawing a fidget spinner"
DESCRIPTION = "This package aims to propose a model of the fidget spinner \
gadget. It exists under different forms with 2, 3 poles and \
even more. We chose the most popular model: the triple Fidget \
Spinner. You can run the PSTricks related documents with \
XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn66115"

RPM_NAME = "texlive-pst-spinner-2026.226.1.02svn66115-60.4.noarch.rpm"
RPM_HASH = "74013a7d8a1db0107b6dd8eaaeef8e7aaf02dc317f8e1b3a5b719bea2d8687f86d1075ae6debb029007202edf4461180e7a7222519577fc48641415a5dac0fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-spinner.sty \
tex-pst-spinner.tex \
texlive-pst-spinner"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
