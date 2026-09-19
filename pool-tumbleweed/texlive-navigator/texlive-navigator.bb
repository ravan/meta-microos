SUMMARY = "PDF features across formats and engines"
DESCRIPTION = "Navigator implements PDF features for all formats (with some \
limitations in ConTeXt) with pdfTeX, LuaTeX and XeTeX (i.e. \
xdvipdfmx). Features include: Customizable outlines (i.e. \
bookmarks); Anchors; Links and actions (e.g. JavaScript or \
user-defined PDF actions); File embedding (not in ConTeXt); \
Document information and PDF viewer's display (not in ConTeXt); \
and Commands to create and use raw PDF objects. Navigator \
requires texapi and yax, both version at least 1.03."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn41413"

RPM_NAME = "texlive-navigator-2026.226.1.1svn41413-61.2.noarch.rpm"
RPM_HASH = "c386db7e0fb7f6f8ef6331d7a20d71dc780bead4537c4f1d6e913cd9beb0514a4b22bf58be151b9157e9cf16dbb589737dcebaee3b85b78cd8e202913a7dec54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-navigator.sty \
tex-navigator.tex \
tex-t-navigator.tex \
texlive-navigator"

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
