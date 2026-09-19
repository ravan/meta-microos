SUMMARY = "Typeset multiline continued equalities"
DESCRIPTION = "The package provides an environment conteq, which will lay out \
systems of continued equalities (or inequalities). Several \
variant layouts of the equalities are provided, and the user \
may define their own. The package is written using LaTeX 3 \
macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn37868"

RPM_NAME = "texlive-conteq-2026.226.0.0.1.1svn37868-61.2.noarch.rpm"
RPM_HASH = "93cfb8ae7322961570b25aaaaf8d2376c8f4a29b7fca5b7e60b9cc8c77be242091070c6c0c43dfe82a736cb575e970e64460e4aa88b01f1700aa30e6e6804ae5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-conteq.sty \
texlive-conteq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-environ.sty \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
