SUMMARY = "Draw a layout to fold the first page of a letter into its own envelope"
DESCRIPTION = "This package provides the \\makeenvelope command, which draws a \
layout for folding the first page of a letter into its own \
envelope, which is provided with the recipient and sender \
addresses."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn76175"

RPM_NAME = "texlive-envelope-letter-2026.226.1.1svn76175-61.4.noarch.rpm"
RPM_HASH = "6fa0a037db0badf44e299879a2b18ad77f7a361f0b7b9488ba8f73a339eed02e5b19633e143177d2c26071ba84453080128e228c755a1af71e4b084008028508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-envelope-letter.sty \
texlive-envelope-letter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
tex-geometry.sty \
tex-graphics.sty \
tex-pgfopts.sty \
tex-pifont.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
