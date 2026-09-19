SUMMARY = "A minimal beamer style"
DESCRIPTION = "The LaTeX package beamertheme-light provides an aesthetic and \
minimal beamer style by redefining colors and fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2svn73158"

RPM_NAME = "texlive-beamertheme-light-2026.226.1.2svn73158-61.2.noarch.rpm"
RPM_HASH = "eaadf8d777afcbb119f93578811a96cb36b48c689486eb6ae4afcc4982dd12464a5223fcf551e27a0798cde2ff9748034d62a0e5e2941afe001b4eef99e453b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamertheme-light.sty \
tex-beamerthemelight.sty \
texlive-beamertheme-light"

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
