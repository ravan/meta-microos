SUMMARY = "Provide a graph datastructure for experimental LaTeX3"
DESCRIPTION = "The package defines a 'graph' data structure, for use in \
documents that are using the experimental LaTeX 3 syntax."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.9svn76924"

RPM_NAME = "texlive-lt3graph-2026.226.0.0.1.9svn76924-59.2.noarch.rpm"
RPM_HASH = "fb7faff81e6c4147e321ea5172423cdcd7743ee987715f71607998e25e0c58435f79dd876cb71c8319a538dba67d0c997f549f47bc4a9fadc9f5b1f1a35bf729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lt3graph-dry.sty \
tex-lt3graph-packagedoc.cls \
tex-lt3graph.sty \
texlive-lt3graph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-filecontents.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-l3keys2e.sty \
tex-listings.sty \
tex-marginnote.sty \
tex-mdframed.sty \
tex-needspace.sty \
tex-noindentafter.sty \
tex-textcomp.sty \
tex-withargs.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
