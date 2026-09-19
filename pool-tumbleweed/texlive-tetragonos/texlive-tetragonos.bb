SUMMARY = "Four-Corner codes of Chinese characters"
DESCRIPTION = "This is a XeLaTeX package for mapping Chinese characters to \
their codes in the Four-Corner Method."
LICENSE = "LPPL-1.0"

PV = "2026.227.1svn49732"

RPM_NAME = "texlive-tetragonos-2026.227.1svn49732-62.2.noarch.rpm"
RPM_HASH = "21d46ca492940702da5e0801fe49891ebbd174a656a24bbc56744ddc5356f51b43b48c17bf52a9ca2462013dc396772f345946eff9992645a0dbbc7b4572c098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tetragonos-database.def \
tex-tetragonos.sty \
texlive-tetragonos"

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
