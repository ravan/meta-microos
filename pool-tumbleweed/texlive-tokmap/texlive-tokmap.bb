SUMMARY = "Iterate over a token list expandably, without dropping spaces or braced groups"
DESCRIPTION = "Usage: \\tokmap <command> { <tokens> } applies command over the \
token list tokens. Space tokens, left and right braces are \
replaced with the marker tokens \\tokmap@space, \\tokmap@bgroup, \
and \\tokmap@egroup respectively (which are \\ifx-equal to \
themselves exclusively). For convenience, command may contain \
multiple tokens. It is assumed that { and } are the only \
characters with category codes 1 (beginning of group) and 2 \
(end of group) respectively. Expandable. This package may be \
used in LaTeX by \\usepackage{tokmap}, or in plain TeX and other \
formats by \\input{tokmap}. See the visualtoks package for an \
example application."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75599"

RPM_NAME = "texlive-tokmap-2026.226.1.0svn75599-59.2.noarch.rpm"
RPM_HASH = "3aaf969c67cd463b5f2223b5552710c6c70e99db9e78e03a867c416a4e44e9d958520e59ba09a6e64483424bd734d411c37e6b3b3ec7c413a8ed0350376c77ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tokmap.sty \
tex-tokmap.tex \
texlive-tokmap"

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
