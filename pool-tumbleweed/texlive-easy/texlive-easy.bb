SUMMARY = "A collection of easy-to-use macros"
DESCRIPTION = "The collection comprises: easybib, support for customising \
bibliographies; easybmat, support for composing block matrices; \
easyeqn, support for various aspects of equations; easymat, \
support for composing matrices; easytable, support for writing \
tables; easyvector, a C-like syntax for writing vectors."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.99svn19440"

RPM_NAME = "texlive-easy-2026.226.0.0.99svn19440-61.4.noarch.rpm"
RPM_HASH = "8fe1aa04f072ca322cae03c669162e65e013ec9debc27f66da6f30d980b699fdde531f0a9bc4f49a61b7ed8d32f7439e504279ee8ffda7293108510b17ffbe2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easy.sty \
tex-easybib.sty \
tex-easybmat.sty \
tex-easyeqn.sty \
tex-easymat.sty \
tex-easytable.sty \
tex-easyvector.sty \
texlive-easy"

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
