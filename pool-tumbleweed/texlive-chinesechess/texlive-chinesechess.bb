SUMMARY = "Typeset Chinese chess with l3draw"
DESCRIPTION = "This LaTeX3 package based on l3draw provides macros and an \
environment for Chinese chess manual writing."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn78101"

RPM_NAME = "texlive-chinesechess-2026.226.1.2.0svn78101-60.2.noarch.rpm"
RPM_HASH = "4fa2fd0d6edf23803f5cb589b88a63ac2431aae84d4caedbfed1855461aebac0b9336f91b68226052b12568247877f815938ef1ae46a62e45c5042e809c91a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chinesechess.sty \
texlive-chinesechess"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3draw.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
