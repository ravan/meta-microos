SUMMARY = "Check citation commands in a document"
DESCRIPTION = "The package provides a lua script written for the sole purpose \
of detecting undefined and unused references from LaTeX \
auxiliary or bibliography files."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.8svn73120"

RPM_NAME = "texlive-checkcites-2026.226.2.8svn73120-60.2.noarch.rpm"
RPM_HASH = "47bb318e7f14d4ba9c5157e95e9b36579901673e6dd73b556bf3e87b861885d6f5bb42739bdf389d81317463a831b967104e2393fa0cc2c8e9fcb749ba5d7ba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-checkcites"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-checkcites-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
