SUMMARY = "Finite state machines, graphs and trees in MetaPost"
DESCRIPTION = "The package offers a collection of macros for MetaPost to make \
easier to draw finite-state machines, automata, labelled \
graphs, etc. The user defines nodes, which may be isolated or \
arranged into matrices or trees; edges connect pairs of nodes \
through arbitrary paths. Parameters, that specify the shapes of \
nodes and the styles of edges, may be adjusted."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn19717"

RPM_NAME = "texlive-automata-2026.226.0.0.3svn19717-60.2.noarch.rpm"
RPM_HASH = "943879bca79912e679dcc48a793b88f1812f52f9f0fb8345aadf9e760e05058b947b243c827720bf6b3eaf09ab23d17d36666bd8c44a197b710d36a957620c1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-automata"

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
