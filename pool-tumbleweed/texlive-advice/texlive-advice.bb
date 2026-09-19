SUMMARY = "Extend commands and environments"
DESCRIPTION = "Like its namesake from the Emacs world, this cross-format \
package implements a generic framework for extending the \
functionality of selected commands and environments. It was \
developed as an auxiliary package of Memoize. This is why it \
is, somewhat unconventionally, documented alongside that \
package. This applies to both the manual and the documented \
code listing."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn70688"

RPM_NAME = "texlive-advice-2026.226.1.1.1svn70688-61.2.noarch.rpm"
RPM_HASH = "6bd17444a9570a66780abe616c6887dbb0b282dcf2701c85e85c33d84501808386f0d82bd2745be5a4341cd37530cd9006d9e6f9ee96f813a61f88510d425890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-advice-tikz.code.tex \
tex-advice.sty \
tex-advice.tex \
tex-t-advice.tex \
texlive-advice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-collargs.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
