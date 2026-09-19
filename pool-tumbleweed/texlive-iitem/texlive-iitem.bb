SUMMARY = "Multiple level of lists in one list-like environment"
DESCRIPTION = "The package defines multiple level lists within one list-like \
environment. instead of writing \\begin{enumerate} \\item 1 \
\\begin{enumerate} \\item 2 \\begin{enumerate} \\item 3 \
\\begin{enumerate} \\item 4 \\end{enumerate} \\end{enumerate} \\item \
2.1 \\end{enumerate} \\item 1.1 \\begin{enumerate} \\item 2 \
\\end{enumerate} \\end{enumerate} this package allows you to \
write \\begin{enumerate} \\item 1 \\iitem 2 \\iiitem 3 \\ivtem 4 \
\\iitem 2.1 \\item 1.1 \\iitem 2 \\end{enumerate}"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn29613"

RPM_NAME = "texlive-iitem-2026.226.1.0svn29613-60.2.noarch.rpm"
RPM_HASH = "282dc17a11613888ada6b65ba9857a893dfea98fcb7a9969bb5b62f16b555193f621c2eaff0d7359d15ae4bf51620044aefebbc2c589f62124768edd09ca4a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iitem.sty \
texlive-iitem"

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
