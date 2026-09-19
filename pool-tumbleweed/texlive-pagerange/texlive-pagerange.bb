SUMMARY = "Flexible and configurable page range typesetting"
DESCRIPTION = "The package defines a command \\pagerange that typesets ranges \
of page numbers, expanding them (e.g., adding first or last \
page numbers) and standardising them."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn16915"

RPM_NAME = "texlive-pagerange-2026.226.0.0.5svn16915-58.2.noarch.rpm"
RPM_HASH = "54ce771d0635fa7ad26ab100266ba88f9e9ad827b11d15c760105596cf076b2118526f08a828e95ffb1f2c6edbe2d7ab802369e83ff0326f6cd81af7392947fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagerange-guide.cfg \
tex-pagerange.sty \
texlive-pagerange"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-lastpage.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
