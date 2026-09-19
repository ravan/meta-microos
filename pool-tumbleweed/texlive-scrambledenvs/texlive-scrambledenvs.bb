SUMMARY = "Create and print scrambled environments"
DESCRIPTION = "This package allows you to create and print scrambled \
environments for purposes such as randomized hint environments. \
You can mark a location with a series of hints, and then print \
the hints at the end in a pseudo-random order. The general \
structure follows: there is an outer environment which creates \
the label, an inner environment that creates the references, \
and a print command that prints out all of the hints. This \
generalizes beyond hints; one can create scrambled solutions as \
well, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn60615"

RPM_NAME = "texlive-scrambledenvs-2026.226.1.1.0svn60615-60.2.noarch.rpm"
RPM_HASH = "172ecefe3f4825100365296eef6c2ccfbbd1d93b2adbb173dbbaaf5fcb56e8cbf26d321fd8790c7179234204e2239590ca7823a5e21e81cc2702a0c3a0c6d573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scrambledenvs.sty \
texlive-scrambledenvs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-forloop.sty \
tex-ifthen.sty \
tex-pgfmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
