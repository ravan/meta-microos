SUMMARY = "Examples from Przechlewski's LaTeX book"
DESCRIPTION = "The bundle provides machine-readable copies of the examples \
from the book 'Praca magisterska i dyplomowa z programem \
LaTeX'."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23552"

RPM_NAME = "texlive-przechlewski-book-2026.226.svn23552-59.2.noarch.rpm"
RPM_HASH = "1c9c902bfecf975fe3139952e576938fc7c2d8d97ad18f9f948a76dcd448292d389b823e02ea1e5bc6d8075d20ead187e122dca4590c63dab1ee1d8a22cf0a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-upmgr.cls \
tex-wkmgr.cls \
texlive-przechlewski-book"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-graphicx.sty \
tex-polski.sty \
tex-prelim2e.sty \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
