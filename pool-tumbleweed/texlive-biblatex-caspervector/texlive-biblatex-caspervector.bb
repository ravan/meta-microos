SUMMARY = "A simple citation style for Chinese users"
DESCRIPTION = "The package provides a simple and easily extensible \
bibliography/citation style for Chinese LaTeX users, using \
BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.7svn76790"

RPM_NAME = "texlive-biblatex-caspervector-2026.226.0.0.3.7svn76790-61.2.noarch.rpm"
RPM_HASH = "9a0b7bfa97934dbc49a16c84fa0e5f212dfd370ce32a9a7382a4d9b55cd2a020e9d6f648fc8850887e7c7410d05e3dc9a522a6e4dac46aba44dc4b74cb6649fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blx-caspervector-base.def \
tex-blx-caspervector-gbk.def \
tex-blx-caspervector-utf8.def \
tex-caspervector-ay.bbx \
tex-caspervector-ay.cbx \
tex-caspervector.bbx \
tex-caspervector.cbx \
texlive-biblatex-caspervector"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-comp.bbx \
tex-authoryear-comp.cbx \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
