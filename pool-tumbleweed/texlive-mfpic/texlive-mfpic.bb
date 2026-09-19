SUMMARY = "Draw Metafont/post pictures from (La)TeX commands"
DESCRIPTION = "Mfpic is a scheme for producing pictures from (La)TeX commands. \
Commands \\mfpic and \\endmfpic (in LaTeX, the mfpic environment) \
enclose a group in which drawing commands may be placed. The \
commands generate a Meta-language file, which may be processed \
by MetaPost (or even Metafont). The resulting image file will \
be read back in to the document to place the picture at the \
point where the original (La)TeX commands appeared. Note that \
the ability to use MetaPost here means that the package works \
equally well in LaTeX and pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn28444"

RPM_NAME = "texlive-mfpic-2026.226.1.10svn28444-61.2.noarch.rpm"
RPM_HASH = "0b8cd794144315a4ab5183f90f12c7b5edc45ced634a7a422bf65e7c7568aecfd44b6cc6c2f9bff1709469a5ecf9686b771e1f4f5c51b06b68a11df51f63799e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mfpic.sty \
tex-mfpic.tex \
tex-mfpicdef.tex \
texlive-mfpic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
