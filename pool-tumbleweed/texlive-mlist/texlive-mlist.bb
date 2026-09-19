SUMMARY = "Logical markup for lists"
DESCRIPTION = "The package defines commands that create macros for typesetting \
vectors, matrices and functions, in a logical way. For example, \
logical indexing can then be used to refer to elements or \
arguments without hard-coding the symbols in the document."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6asvn77682"

RPM_NAME = "texlive-mlist-2026.226.0.0.6asvn77682-61.2.noarch.rpm"
RPM_HASH = "f833c5daa2c9ad30fed08e804715f4edc5c22710bb1dd6ec5733217b9c4b5ff04ddb548797729dfaa49c8f3da228aec6adff12dda371190bdb5d8d59d18e792f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mlist.cfg \
tex-mlist.sty \
texlive-mlist"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifmtarg.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
