SUMMARY = "Utility functions for setting tounicode mappings for 7/8 bit fonts"
DESCRIPTION = "This package provides utility functions in expl3 and LaTeX2e \
syntax for setting tounicode mappings for 7/8 bit fonts. The \
package provides a unified interface which enables mappings for \
both pdfTeX and LuaTeX. The aim is to make it easier to make \
legacy (text) symbol packages, which often use arbitary glyph \
names and encodings, accessible for the two engines currently \
capable of producing accessible PDFs. The package provides a \
limited workaround for LuaTeX 1.22 and earlier, which make the \
provision of such mappings more challenging. Full support \
requires pdfTeX or LuaTeX 1.24 or later."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn78112"

RPM_NAME = "texlive-fixtounicode-2026.226.0.0.1.1svn78112-59.2.noarch.rpm"
RPM_HASH = "5758fccaf1d2ee6f6273546e219a3ae6511d57b5d8915afe8273ada3ddd91d34cc74144491ed74a97149f3616d98aaf09d0227d296743d903804b430f238ef19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixtounicode.sty \
texlive-fixtounicode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-glyphtounicode.tex \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
