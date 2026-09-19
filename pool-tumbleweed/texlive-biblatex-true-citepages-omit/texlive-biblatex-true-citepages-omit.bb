SUMMARY = "Correction of some limitation of the citepages=omit option of BibLaTeX styles"
DESCRIPTION = "This package deals with a limitation of the citepages=omit \
option of the verbose family of BibLaTeX citestyles. The option \
works when you \\cite[xx]{key}, but not when you \\cite[\\pno~xx, \
some text]{key}. The package corrects this problem."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn76790"

RPM_NAME = "texlive-biblatex-true-citepages-omit-2026.226.2.0.0svn76790-61.2.noarch.rpm"
RPM_HASH = "94339707a50b7f86200bd2ff043b977931b4f75829945b06574af1db092b6bc8e536bc3d17e7bc4c02641f0efe5f305ea5c4c62a6c141c60052ca3a3b3568f09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-true-citepages-omit.sty \
texlive-biblatex-true-citepages-omit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
