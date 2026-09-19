SUMMARY = "A PSTricks package for drawing Venn sets"
DESCRIPTION = "This is a PSTricks related package for drawing Venn diagrams \
with three circles."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn49316"

RPM_NAME = "texlive-pst-venn-2026.226.0.0.01svn49316-60.4.noarch.rpm"
RPM_HASH = "0cc86a27d32458b40d6bd45da8d74cbf703cecc4f89c46052a746f8d82d647c61d9fc2d570b4f8c529675c7103cb8abdf274dd883e11e704f221652c2d335a11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-venn.sty \
texlive-pst-venn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
