SUMMARY = "Draw block diagrams, using TikZ"
DESCRIPTION = "The package provides a set of macros for constructing block \
diagrams, using TikZ. (The blox package is an 'English \
translation' of this package.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn68445"

RPM_NAME = "texlive-schemabloc-2026.226.1.9svn68445-60.2.noarch.rpm"
RPM_HASH = "42a3d8c8d238812972eb41d4609f3f174d3cf5452bc8481e4947935cf33fa1823629292cc99908ec34d041759384b227226ecb1e2bb8e852bbbf17fb3c05ea73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schemabloc.sty \
texlive-schemabloc"

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
