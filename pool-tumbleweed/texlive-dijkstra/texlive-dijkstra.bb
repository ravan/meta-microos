SUMMARY = "Dijkstra algorithm for LaTeX"
DESCRIPTION = "This small package uses the Dijkstra algorithm for weighted \
graphs,directed or not: the search table of the shortest path \
can be displayed, the minimum distance between two vertices and \
the corresponding path are stored in macros. This packages \
depends on simplekv."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.13svn64580"

RPM_NAME = "texlive-dijkstra-2026.226.0.0.13svn64580-59.2.noarch.rpm"
RPM_HASH = "b2cac015c35ae5cbc30eb7ebbffcb8551b2a675805324cb3078a50ed73c8568eaea1cc729aac7ba1c0a79c3c03501ae9584a110dbcb806b82708bd38a3b87d9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dijkstra.sty \
texlive-dijkstra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-simplekv.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
