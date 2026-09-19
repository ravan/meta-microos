SUMMARY = "Draw visual representations of matrices in LaTeX"
DESCRIPTION = "The package provides macros to visually represent matrices. \
Various options allow to change the visualizations, e.g., \
drawing rectangular, triangular, or banded matrices."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.0svn44471"

RPM_NAME = "texlive-drawmatrix-2026.226.1.5.0svn44471-59.2.noarch.rpm"
RPM_HASH = "8587816f960dc07b420436c476c0dfce4945aee4ff53420aef34e859218f97aefeb4f33d61607a2bba6da8e2c9c378c41522a0d9cf617e69322347ef5aee230f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-drawmatrix.sty \
texlive-drawmatrix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
