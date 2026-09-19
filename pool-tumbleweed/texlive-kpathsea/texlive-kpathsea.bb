SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the \
self-locating feature required for movable installations, \
layered on top of a general search mechanism. It is not \
distributed separately, but rather is released and maintained \
as part of the TeX Live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.svn77861"

RPM_NAME = "texlive-kpathsea-2026.226.svn77861-63.2.noarch.rpm"
RPM_HASH = "30eff24a53c4540b69b26360562b247de7dc56a329a29bd911c65782cca85813fc17b2f45a50552936fa5e23bba43baa57374dba3aa24bdc5d36a9ff0296005f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-kpathsea \
tex-fmtutil.cnf \
tex-mktex.cnf \
tex-texmf.cnf \
texlive-kpathsea"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
diffutils \
ed \
findutils \
grep \
sed \
texlive-filesystem \
texlive-gsftopk \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-updmap-map"

inherit rpm
