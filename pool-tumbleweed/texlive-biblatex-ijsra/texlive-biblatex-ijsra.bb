SUMMARY = "BibLaTeX style for the International Journal of Student Research in Archaeology"
DESCRIPTION = "BibLaTeX style used for the journal International Journal of \
Student Research in Archaeology."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76790"

RPM_NAME = "texlive-biblatex-ijsra-2026.226.0.0.1svn76790-61.2.noarch.rpm"
RPM_HASH = "eb2e18512eb822790bf0a0eb33aa2e246622bb1e04590c1171834d409009063e96400fc1bae457dc4edb33e1948048dd51bd2a86a1cc7c35eb5f4473659912c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ijsra.bbx \
tex-ijsra.cbx \
texlive-biblatex-ijsra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear.bbx \
tex-authoryear.cbx \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
