SUMMARY = "Enhanced \\newfont command"
DESCRIPTION = "This package provides a new command \\newfontx. It is similar to \
the old (and deprecated) command \\newfont in function, but is \
more compatible with NFSS. In particular, one can safely change \
font size after invoking a font command defined by \\newfontx. \
The new command will be useful to users who know much of the \
old \\newfont command, but are unfamiliar with the details of \
NFSS."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2bsvn44173"

RPM_NAME = "texlive-bxnewfont-2026.226.0.0.2bsvn44173-59.2.noarch.rpm"
RPM_HASH = "4050110ee27e5a9569ec8c57f51cf6c7db736f6f9e8018d2baab8759f1acbc8212674619eb20d9d25763a577bffbe89c80408ca2e21d13ba7a0d7c54b13a5c7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxnewfont.sty \
texlive-bxnewfont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
