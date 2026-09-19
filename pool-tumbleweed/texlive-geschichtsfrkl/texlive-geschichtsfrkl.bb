SUMMARY = "BibLaTeX style for historians"
DESCRIPTION = "The package provides a BibLaTeX style, (mostly) meeting the \
requirements of the History Faculty of the University of \
Freiburg (Germany)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn42121"

RPM_NAME = "texlive-geschichtsfrkl-2026.226.1.4svn42121-60.2.noarch.rpm"
RPM_HASH = "f83d11129ac1fbecdeff00a1cf8d97fd577486d033946f8a86123fddd3f68eccfb343f0a19ebb3c04addb0e1b783f8c937ab3c254b1937e050f31c3b1087959d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-geschichtsfrkl.bbx \
tex-geschichtsfrkl.cbx \
tex-geschichtsfrkldoc.sty \
texlive-geschichtsfrkl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
