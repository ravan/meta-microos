SUMMARY = "BibLaTeX implementation of the unified stylesheet for linguistics journals"
DESCRIPTION = "BibLaTeX-unified is an opinionated BibLaTeX implementation of \
the Unified Stylesheet for Linguistics Journals"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn64975"

RPM_NAME = "texlive-biblatex-unified-2026.226.1.20svn64975-61.2.noarch.rpm"
RPM_HASH = "5633dbdc1b7407077efab8d376d0919f4e77ef814144f424be04904e4b3af3c3c21c93f0ffece2f417452ee0419ea6caeb8238497933a6905077992965efc3a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unified.bbx \
tex-unified.cbx \
texlive-biblatex-unified"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-comp.cbx \
tex-authoryear.bbx \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
