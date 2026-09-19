SUMMARY = "Draw interaction nets with TikZ"
DESCRIPTION = "The package extends TikZ with macros to draw interaction nets."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn15878"

RPM_NAME = "texlive-tikz-inet-2026.226.0.0.1svn15878-59.2.noarch.rpm"
RPM_HASH = "052fb2ad87fb5d0107661184d7f43a47fd0b60e48c86720a1b64cee09c466f837c664d2beb67fb5c9a16ef627720b4f7f09cd1a164b8e04785a47a22caf462eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-inet.sty \
texlive-tikz-inet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
