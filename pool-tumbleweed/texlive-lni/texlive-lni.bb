SUMMARY = "Official class for the 'Lecture Notes in Informatics'"
DESCRIPTION = "This is the official version of the class 'lni' for submissions \
to the Lecture Notes in Informatics published by the \
Gesellschaft fur Informatik. To use it, download the file \
lni-author-template.tex and edit it in your favorite LaTeX \
editor."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-lni-2026.226.2.0svn77682-61.2.noarch.rpm"
RPM_HASH = "0c4e964f9a8166a325018270a0d0ce108b75a9a36ded9e674a382f3a103c4cb21d248d96fd26c2dda4223153ee5f2496b17e582eb24d4b7c200957a8bd4b44dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lni.cls \
texlive-lni"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-article.cls \
tex-authblk.sty \
tex-babel.sty \
tex-caption.sty \
tex-cleveref.sty \
tex-cmap.sty \
tex-crop.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-graphicx.sty \
tex-grffile.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-listings.sty \
tex-mathptmx.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-newtxtt.sty \
tex-orcidlink.sty \
tex-selnolig.sty \
tex-textcomp.sty \
tex-url.sty \
tex-verbatim.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
