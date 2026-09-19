SUMMARY = "Package for setting nucleotide and peptide alignments"
DESCRIPTION = "TeXshade is alignment shading software completely written in \
TeX/LaTeX; it can process multiple sequence alignments in the \
.MSF and the .ALN file formats. In addition to common shading \
algorithms, it provides special shading modes showing \
functional aspects, e.g. charge or hydropathy, and a wide range \
of commands for handling shading colours, text styles, labels, \
legends; it even allows the user to define completely new \
shading modes. TeXshade combines highest flexibility with TeX \
output quality -- all in a bundle that does not demand \
excessive development time of the user."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.29svn76586"

RPM_NAME = "texlive-texshade-2026.227.1.29svn76586-62.2.noarch.rpm"
RPM_HASH = "3e84955a84c725fa1a3ec7f3f4a99a8437a8db04e20711affb29a953ae419057888ee6fdb04b42d917505e56356cbcf229f3b77a11f48185a93210ad72b4f611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texshade.def \
tex-texshade.sty \
texlive-texshade"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-color.sty \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
