SUMMARY = "Documentation files for (u)pBibTeX"
DESCRIPTION = "The bundle contains documentation files for Japanese pBibTeX \
and upBibTeX. For historical reasons, this also contains old \
documentation files for JBibTeX."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn66181"

RPM_NAME = "texlive-pbibtex-manual-2026.226.svn66181-58.2.noarch.rpm"
RPM_HASH = "1a276b6dadf331e641c1de529a5ef9f77a792f965a9591c5d8da5a9d29b42d55f2e7c37e920b4d64ed1db721e8be90a76a33688293364ec23a4390738b9b8a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbibtex-manual"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
