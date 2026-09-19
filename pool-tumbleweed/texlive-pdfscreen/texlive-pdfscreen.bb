SUMMARY = "Support screen-based document design"
DESCRIPTION = "An extension of the hyperref package to provide a screen-based \
document design. This package helps to generate pdf documents \
that are readable on screen and will fit the screen's aspect \
ratio. Also it can be used with various options to produce \
regular print versions of the same document without any extra \
effort."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn42428"

RPM_NAME = "texlive-pdfscreen-2026.226.1.5svn42428-58.2.noarch.rpm"
RPM_HASH = "79d73ee976688d651bfc911940890e4c4b99d0e0bc7b798694539104f3195c4b0d4bc23625bf752cf8438f26ec60fb8a28f65405d894dd78ca8fd7527e926719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfscreen.sty \
texlive-pdfscreen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amssymb.sty \
tex-calc.sty \
tex-color.sty \
tex-comment.sty \
tex-fancybox.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-shortvrb.sty \
tex-truncate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
