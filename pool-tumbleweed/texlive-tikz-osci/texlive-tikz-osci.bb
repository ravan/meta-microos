SUMMARY = "Produce oscilloscope 'screen shots'"
DESCRIPTION = "This package enables you to produce oscilloscope 'screen \
shots'."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.0svn68636"

RPM_NAME = "texlive-tikz-osci-2026.226.0.0.4.0svn68636-59.2.noarch.rpm"
RPM_HASH = "18382613d8299ea55d6f7caddc1c54934618b229e3d64e4dbdee35de6180dba0acfe5a6bdfd4bc5594e85cdab4a0fa19521e47032759b64e17e1ad5c6e6cf6eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-osci.sty \
texlive-tikz-osci"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
tex-pgfplots.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
