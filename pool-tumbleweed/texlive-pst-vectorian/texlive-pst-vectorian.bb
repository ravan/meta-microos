SUMMARY = "Printing ornaments"
DESCRIPTION = "The package uses PSTricks to draw ornaments (a substantial \
repertoire of ornaments is provided)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.42svn78101"

RPM_NAME = "texlive-pst-vectorian-2026.226.0.0.42svn78101-60.4.noarch.rpm"
RPM_HASH = "793d50c6777ed9e6d5824a4812372a6365aeb586acbaf69f532753f93e9a0c350d2d7b281ef1f56b682c1dbdbd27e5f88b6bf54870d9f5d25461526f796079d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-psvectorian.sty \
texlive-pst-vectorian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
