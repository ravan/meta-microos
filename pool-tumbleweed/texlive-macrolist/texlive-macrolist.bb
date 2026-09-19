SUMMARY = "List operations for LaTeX2e"
DESCRIPTION = "This package provides a list data structure and common list \
functions such as \\macrolistadd, \\macrolistremove, \
\\macrolistforeach, as well as \\macrolistremovelast (similar to \
C++'s pop_back) and \\macrolistjoin (similar to Javascript's \
arr.join). Unlike most programming languages, the lists in this \
package are 1-indexed, meaning the first element is numbered 1, \
the second element numbered 2, and so on."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.0svn60139"

RPM_NAME = "texlive-macrolist-2026.226.2.1.0svn60139-59.2.noarch.rpm"
RPM_HASH = "8cad1cd756b08f5112464f92888c976cf08a8c2342108f497534522b03a0cdbb3ea31eef42d764136ce37cb9f514f8d4a632fe4d78430c58e9203caaa5460e89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-macrolist.sty \
texlive-macrolist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgffor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
