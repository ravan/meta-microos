SUMMARY = "Italian translation of amsthdoc: Using the amsthm package"
DESCRIPTION = "The amsthdoc-it package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45662"

RPM_NAME = "texlive-amsthdoc-it-2026.226.svn45662-61.2.noarch.rpm"
RPM_HASH = "e8314f74155d03a407ff667dda9ac974b4b4a22d2fd781192a474531b3b10feee704d878ab7cbb034634491cf9d3a6f2bd3058f9d8b3c8d10a342dc8639720e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsthdoc-it"

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
