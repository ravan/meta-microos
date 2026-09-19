SUMMARY = "BibLaTeX style for Brazil's ABNT rules"
DESCRIPTION = "This package offers a BibLaTeX style for Brazil's ABNT \
(Brazilian Association of Technical Norms) rules."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0svn72565"

RPM_NAME = "texlive-biblatex-abnt-2026.226.4.0svn72565-61.2.noarch.rpm"
RPM_HASH = "91209383dc315845ded6b833559a0bce035972a37f405bede79d5df572c31835091986f7e51bc6dbe31a79cf8f804d1fa516d48690e25d6826baf8d353a748c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abnt-ibid.bbx \
tex-abnt-ibid.cbx \
tex-abnt-numeric.bbx \
tex-abnt-numeric.cbx \
tex-abnt.bbx \
tex-abnt.cbx \
tex-american-abnt.lbx \
tex-australian-abnt.lbx \
tex-brazil-abnt.lbx \
tex-brazilian-abnt.lbx \
tex-british-abnt.lbx \
tex-canadian-abnt.lbx \
tex-english-abnt.lbx \
tex-french-abnt.lbx \
tex-german-abnt.lbx \
tex-italian-abnt.lbx \
tex-portuges-abnt.lbx \
tex-portuguese-abnt.lbx \
tex-spanish-abnt.lbx \
texlive-biblatex-abnt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-comp.cbx \
tex-brazilian.lbx \
tex-english.lbx \
tex-expl3.sty \
tex-french.lbx \
tex-german.lbx \
tex-italian.lbx \
tex-numeric.cbx \
tex-spanish.lbx \
tex-standard.bbx \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
