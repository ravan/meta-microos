SUMMARY = "Typeset syntactic trees"
DESCRIPTION = "A package to typeset syntactic trees such as those used in \
Chomsky's Generative grammar, based on a description of the \
structure of the tree."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.2svn16252"

RPM_NAME = "texlive-synttree-2026.226.1.4.2svn16252-64.2.noarch.rpm"
RPM_HASH = "cd9ff817383537eafb92512975e6545d7bdf038810e48778a6b41a2a4546dee991e588438077756cdc798b85e617b5921c20399045810481f87e761d5d015134"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-synttree.sty \
texlive-synttree"

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
