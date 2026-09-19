SUMMARY = "A tool to manage anonymous work with BibLaTeX"
DESCRIPTION = "The package provides tools to help manage anonymous work with \
BibLaTeX. It will be useful, for example, in history or \
classical philology."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6.2svn48548"

RPM_NAME = "texlive-biblatex-anonymous-2026.226.2.6.2svn48548-61.2.noarch.rpm"
RPM_HASH = "5ba2db114966e46db2bc4d807f379266961f79e00774befad57973a2955d040d7a74e1de8f299576042358a739f347d8d6596179dc798c462e07573325654517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-anonymous.sty \
texlive-biblatex-anonymous"

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
