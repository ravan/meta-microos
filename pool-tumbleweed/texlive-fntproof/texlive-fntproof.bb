SUMMARY = "A programmable font test pattern generator"
DESCRIPTION = "The package implements all the font testing commands of Knuth's \
testfont.tex, but arranges that information necessary for each \
command is supplied as arguments to that command, rather than \
prompted for. This makes it possible to type all the tests in \
one command line, and easy to input the package in a file and \
to use the commands there. A few additional commands supporting \
this last purpose are also made available."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn20638"

RPM_NAME = "texlive-fntproof-2026.226.svn20638-60.2.noarch.rpm"
RPM_HASH = "c17589db9f09464e860e6193d4feb187fd489bc19356e6aaa047ef46af99e407ddaf4a2af903cdd1fa28a2e28a9d7a3d74230ca592ff9236ef56f162c6e46671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fntproof.tex \
texlive-fntproof"

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
