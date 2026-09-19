SUMMARY = "Measure restriction symbol in LaTeX"
DESCRIPTION = "This package provides a simple macro \\resmes that prints the \
measure restriction symbol."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn65375"

RPM_NAME = "texlive-resmes-2026.226.1.0svn65375-60.4.noarch.rpm"
RPM_HASH = "a1cc9d905769ced05d1c5a828d328f7e210d9d05d47f23f2b245a430682492530646cc3d58ad10c17c36389eb9920f5c1cdf645c92967b57831d6dd68c06d18d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-resmes.sty \
texlive-resmes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
