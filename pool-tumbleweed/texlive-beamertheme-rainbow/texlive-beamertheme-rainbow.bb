SUMMARY = "A beamer colour theme which alternates theme colours on every frame"
DESCRIPTION = "This package provides a beamer colour theme which alternates \
theme colours on every frame."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn72864"

RPM_NAME = "texlive-beamertheme-rainbow-2026.226.1.0svn72864-61.2.noarch.rpm"
RPM_HASH = "a3d448263dbe24375e2e551328d82218fce6e4ee08d04d3575a8938be7add2c2f47c924b9a5445ae957580b29c20d56afc231c41c3cc55b40892fe37c2bb07a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemerainbow.sty \
texlive-beamertheme-rainbow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-beamer \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-tools"

inherit rpm
