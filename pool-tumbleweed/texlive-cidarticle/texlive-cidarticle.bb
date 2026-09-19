SUMMARY = "A class for submissions to the 'Commentarii informaticae didacticae' (CID)"
DESCRIPTION = "The cidarticle bundle is used for writing articles to be \
published in the 'Commentarii informaticae didacticae (CID)'. \
The LaTeX class file is based on the class used for the \
'Lecture Notes in Informatics (LNI)' \
(https://github.com/gi-ev/LNI)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn68976"

RPM_NAME = "texlive-cidarticle-2026.226.1.1svn68976-60.2.noarch.rpm"
RPM_HASH = "b723250d72b25b475f5afb0ce22b52724bb1968d9c6a79e3b3ec672f244e3fee48785671493933ec79e687d7f894eb2c749ee224e345c03d1e68bbbd5352c3a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cidarticle.cls \
texlive-cidarticle"

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
tex-bookmark.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-cleveref.sty \
tex-cmap.sty \
tex-colorprofiles.sty \
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
tex-orcidlink.sty \
tex-pdfx.sty \
tex-ragged2e.sty \
tex-selnolig.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-tikz.sty \
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
