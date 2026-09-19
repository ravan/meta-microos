SUMMARY = "Chinese Introduction to TeX and LaTeX"
DESCRIPTION = "The document is an introduction to TeX/LaTeX, in Chinese. It \
covers basic text typesetting, mathematics, graphics, tables, \
Chinese language & fonts, and some miscellaneous features \
(hyperlinks, long documents, bibliographies, indexes and page \
layout)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn15878"

RPM_NAME = "texlive-latex-notes-zh-cn-2026.226.1.20svn15878-63.2.noarch.rpm"
RPM_HASH = "c6753f3b878a5a66ecbac2e75937d3fc90cc3dcc5fb6826437dce728af822869828a587d5c499b8ed9afd130fa68941adb39aed8565e7a7e7dc953b566a44318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-notes-zh-cn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
