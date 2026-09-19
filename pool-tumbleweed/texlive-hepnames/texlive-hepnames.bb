SUMMARY = "Pre-defined high energy particle names"
DESCRIPTION = "Hepnames provides a pair of LaTeX packages, heppennames and \
hepnicenames, providing a large set of pre-defined high energy \
physics particle names built with the hepparticles package. The \
packages are based on pennames.sty by Michel Goossens and Eric \
van Herwijnen. Heppennames re-implements the particle names in \
pennames.sty, with some additions and alterations and greater \
flexibility and robustness due to the hepparticles structures, \
which were written for this purpose. Hepnicenames provides the \
main non-resonant particle names from heppennames with more \
'friendly' names."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn76924"

RPM_NAME = "texlive-hepnames-2026.226.2.0svn76924-60.4.noarch.rpm"
RPM_HASH = "e67ee280a8d31477575c143f20ee80749afac71195c103780b77524ff73884d6a31b47b6448df79a1cbefb44606faa4890609efffaa01ea5c96148b58454eac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hepnames.sty \
tex-hepnicenames.sty \
tex-heppennames.sty \
texlive-hepnames"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-hepparticles.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
