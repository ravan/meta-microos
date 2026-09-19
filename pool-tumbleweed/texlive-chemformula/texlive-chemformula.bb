SUMMARY = "Command for typesetting chemical formulas and reactions"
DESCRIPTION = "The package provides a command to typeset chemical formulas and \
reactions in support of other chemistry packages (such as \
chemmacros). The package used to be distributed as a part of \
chemmacros."
LICENSE = "LPPL-1.0"

PV = "2026.226.4.17svn77682"

RPM_NAME = "texlive-chemformula-2026.226.4.17svn77682-60.2.noarch.rpm"
RPM_HASH = "c9b2548eccb88bff35364ef042c8ddbb93ab1f5d7acec5dee77d3d4ba3d924ed0c0aad459e9f1529e26662c1d06beabf5f36ade5cee6fe054c723289a0618781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemformula.sty \
texlive-chemformula"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-nicefrac.sty \
tex-tikz.sty \
tex-xfrac.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-units"

inherit rpm
