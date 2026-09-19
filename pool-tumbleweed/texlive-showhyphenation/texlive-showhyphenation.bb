SUMMARY = "Marking of hyphenation points"
DESCRIPTION = "The package shows the hyphenation points in the document by \
either inserting small triangles below the baseline or by \
typesetting explicit hyphens. The markers are correctly placed \
even within ligatures and their size adjusts to the font size. \
By option the markers can be placed behind or in front of the \
glyphs. The package requires LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-showhyphenation-2026.226.0.0.3svn77682-60.2.noarch.rpm"
RPM_HASH = "543097daac9e88784e6919ce75d90f5f060051fa917324b91353c2e44cc054e8f07c06465d639ef8587d0674295413522034ade1f98c4720f10e930cfa87b975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showhyphenation.sty \
texlive-showhyphenation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
