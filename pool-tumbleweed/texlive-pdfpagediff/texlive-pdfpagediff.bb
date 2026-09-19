SUMMARY = "Find difference between two PDF's"
DESCRIPTION = "Find difference between two PDF's"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn37946"

RPM_NAME = "texlive-pdfpagediff-2026.226.1.4svn37946-58.2.noarch.rpm"
RPM_HASH = "d1f73f717d78325ecd4b83a6f66cf9693ef69e43eaa7992f025a00c4ad51617b99d047f14d9a89728945a31eb11ff40e1e0b72ea4ab4e6e55a3a768655ddc36a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfpagediff.sty \
texlive-pdfpagediff"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-substr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
