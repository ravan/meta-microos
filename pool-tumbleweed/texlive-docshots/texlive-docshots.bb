SUMMARY = "TeX samples next to their PDF snapshots"
DESCRIPTION = "This LaTeX package helps you show TeX code next to the \
corresponding PDF snapshots, in two-column formatting. You can \
use it either in .dtx documentation or in .tex files."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.3svn69676"

RPM_NAME = "texlive-docshots-2026.226.0.0.4.3svn69676-59.2.noarch.rpm"
RPM_HASH = "969cc44e47b3ddc74a4b36c36639361b7eebcc9c1bde1b2d55b2c7b5638516550dd8cab5020a6c341a060e0de6cf9a53fd4d2969161be2d004d752943f48275f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-docshots.sty \
texlive-docshots"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancyvrb.sty \
tex-graphicx.sty \
tex-iexec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-pdftexcmds.sty \
tex-pgfopts.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-fancyvrb \
texlive-filesystem \
texlive-iexec \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdfcrop \
texlive-pgf \
texlive-pgf-blur \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
