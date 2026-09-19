SUMMARY = "Easy generation of FAST diagrams"
DESCRIPTION = "The package provides simple means of producing FAST diagrams, \
using TikZ/pgf tools. FAST diagrams are useful for functional \
analysis techniques in design methods."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn29264"

RPM_NAME = "texlive-fast-diagram-2026.226.1.1svn29264-59.2.noarch.rpm"
RPM_HASH = "138b3bdc218bdd2a982032553d5470b9800cfb1fce715cf59e7a84bb36c7c2f79fa959b49ac52bed628e551a95424ddf0de0ab35664ed4efcca9604ee93dfc54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fast-diagram.sty \
texlive-fast-diagram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-relsize.sty \
tex-tikz.sty \
tex-xargs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
