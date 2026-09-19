SUMMARY = "LaTeX to commands in Portuguese"
DESCRIPTION = "This package transforms common commands used in LaTeX to \
commands in Portuguese."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn67125"

RPM_NAME = "texlive-ptlatexcommands-2026.226.0.0.1svn67125-60.4.noarch.rpm"
RPM_HASH = "09cc94c80588a4e41b14150634c17ccda8e585ab78cdbfd725ae2777d406a2e73c67863c7856dcb953bc6dfea7b06903443bce3e4ea1626708b2bb9db6254f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-PTLatexCommands.sty \
texlive-ptlatexcommands"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm.sty \
tex-algorithmic.sty \
tex-amsmath.sty \
tex-biblatex.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
