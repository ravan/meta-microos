SUMMARY = "Typeset maps and blocks according to the Information Mapping(r) method"
DESCRIPTION = "The Information Mapping(r) method provides a methodology for \
structuring and presenting information. It claims to be useful \
for readers who are more concerned about finding the right \
information than reading the document as a whole. Thus short, \
highly structured, and context free pieces of information are \
used. A LaTeX style and a LaTeX class are provided. The style \
contains definitions to typeset maps and blocks according to \
the Information Mapping(r) method. The class provides all \
definitions to typeset a whole document."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn44863"

RPM_NAME = "texlive-limap-2026.226.2.2svn44863-61.2.noarch.rpm"
RPM_HASH = "e766da9a6c9cfe375332746f9916a9a14fe085bb979770668a8b46135890af775ca3f8316362fd11bed2a92621bb4831f884d826554f23cbb31a4bea52a90e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-limap.cls \
tex-limap.sty \
texlive-limap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
