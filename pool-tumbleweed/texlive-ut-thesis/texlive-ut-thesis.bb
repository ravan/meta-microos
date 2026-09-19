SUMMARY = "University of Toronto thesis style"
DESCRIPTION = "This LaTeX document class implements the formatting \
requirements of the University of Toronto School of Graduate \
Studies (SGS), as of Fall 2020 ( \
https://www.sgs.utoronto.ca/academic-progress/program-completio \
n/formatting). For example usage, see the GitHub repository."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1.8svn78219"

RPM_NAME = "texlive-ut-thesis-2026.226.3.1.8svn78219-60.2.noarch.rpm"
RPM_HASH = "fc348b2bf469df61d58c40646b69be2d4cb37abc4bd426d60202c8bbeb46c54b2844a21819563fc1dde38fa9d2ecc303a9fe4425f4ee7444816af2a6d916f74f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ut-thesis.cls \
texlive-ut-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-geometry.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
