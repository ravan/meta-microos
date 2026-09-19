SUMMARY = "A document class for report writing in university settings"
DESCRIPTION = "This package provides a documentclass for streamlining document \
creation in LaTeX. It does not overwrite any TeX or LaTeX \
commands so the user could use their own macros or other \
commands as they wish."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn72033"

RPM_NAME = "texlive-hebdomon-2026.226.0.0.1svn72033-60.4.noarch.rpm"
RPM_HASH = "487d4f9a82d676756bca6ed0e7036b1c52ce729d2a4b3f80df778974e070fc05d26729af63cd93b5e8265bb9ae6664d96f76a6b4c5ad00a6a72ffa37cb86e68c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hebdomon.cls \
texlive-hebdomon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-FiraSans.sty \
tex-amsmath.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-minitoc.sty \
tex-minted.sty \
tex-nicematrix.sty \
tex-pgfplots.sty \
tex-setspace.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
