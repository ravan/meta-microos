SUMMARY = "Provides dotless i's and j's for use in any math font"
DESCRIPTION = "The package provides two commands: \\dotlessi and \\dotlessj, \
which give access to dotless i's and j's in math mode. They are \
intended for symbols in non English languages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-dotlessi-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "7c2c23c75515e50e94b37ddcccacdcaffcc777772575c67cd6e24af32b29ba84ace8eff52fd706e896373695b1d1dfaca2049fcc043704868f8077b16aa62824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dotlessi.sty \
texlive-dotlessi"

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
