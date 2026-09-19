SUMMARY = "TeX Live manual (Spanish)"
DESCRIPTION = "The texlive-es package"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn74997"

RPM_NAME = "texlive-texlive-es-2026.227.svn74997-62.2.noarch.rpm"
RPM_HASH = "4a0aec39e4bca3f710a6f41700086e9f92c1d437a964b9cd277c7918d9a6cc5483ba65178157c1692fa7db55a0c4f3da018517b95f7afec68ac51715304332d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-es"

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
