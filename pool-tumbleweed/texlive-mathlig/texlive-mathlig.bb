SUMMARY = "Define maths 'ligatures'"
DESCRIPTION = "The package defines character sequences that 'behave like' \
ligatures, in maths mode. Example definitions (chosen to show \
the package's flexibility, are: \\mathlig{->}{\\rightarrow} \
\\mathlig{<-}{\\leftarrow} \\mathlig{<->}{\\leftrightarrow}"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn54244"

RPM_NAME = "texlive-mathlig-2026.226.1.0svn54244-59.2.noarch.rpm"
RPM_HASH = "6fb2770a69c3a12612fcb05f432a09402bfe83cf3e79d663cd0d2221cff930a5e331e995c9aca0464b1078cac3a7f82ec6b57d45943a4f957a14d0c378896bfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathlig.tex \
texlive-mathlig"

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
