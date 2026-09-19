SUMMARY = "Simple commands for caps-to-small-caps text"
DESCRIPTION = "This package provides a simple command (\\textcsc and \\cscshape) \
for caps-to-small-caps text, to allow for small caps acronyms \
to be presented as uppercase in text (useful for things like \
copying and pasting from a PDF)."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.2.0svn67193"

RPM_NAME = "texlive-textcsc-2026.227.1.2.0svn67193-62.2.noarch.rpm"
RPM_HASH = "145b5bfa6cbf0114943840a600b540121c4a3e6eba4c673a974c0c8be232dff84fd0559a936684d56ecf694dfae002ae9a0b8674880ab6eababb8e7f66fb22f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textcsc.sty \
texlive-textcsc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
