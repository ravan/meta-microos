SUMMARY = "Display network packets"
DESCRIPTION = "This package allows you to easily display network packets \
graphically."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn55827"

RPM_NAME = "texlive-tikzpackets-2026.226.1.0svn55827-59.2.noarch.rpm"
RPM_HASH = "243f64b03f1e595298b2def5fc0d40ee032424451f94350732c98b63f96dba5eda68fac0c72fa7f02e6f40d53de28a4af37f850094df70857f26aa535b405ff3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzPackets.sty \
texlive-tikzpackets"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pbox.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
