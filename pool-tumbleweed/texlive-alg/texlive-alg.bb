SUMMARY = "LaTeX environments for typesetting algorithms"
DESCRIPTION = "Defines two environments for typesetting algorithms in LaTeX2e. \
The algtab environment is used to typeset an algorithm with \
automatically numbered lines. The algorithm environment can be \
used to encapsulate the algtab environment algorithm in a \
floating body together with a header, a caption, etc. \
\\listofalgorithms is defined."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-alg-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "63c990d6df9d957e1e132f429c89f50c4d1584d34776402a9fb093fce448abd39796a191dc096177b2e75218337a0795cd659da0d4c9067a650c7a4a9c9fd3e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alg.sty \
texlive-alg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
