SUMMARY = "Use Lambda expression within LaTeX"
DESCRIPTION = "This package provides Lambda expressions. It is an interface to \
specify the parameters and replacement code of a \
document-command, and then to evaluate it with compatible \
arguments. Optionally, it can be used recursively."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn60278"

RPM_NAME = "texlive-lambdax-2026.226.1.1svn60278-63.2.noarch.rpm"
RPM_HASH = "9319acf49566c5cce66d2709a606f57ece44d79e167b8aa28679e7f2b698f4e675df6b905418047ec95c41dc8c96721d6c76314a302a2b9c57e6ed801763039e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lambdax.sty \
texlive-lambdax"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-keyparse.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
