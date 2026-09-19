SUMMARY = "Write numbers as cyrillic glyphs"
DESCRIPTION = "The package extends ConTeXt's system of number conversion, by \
adding numeration using cyrillic letters."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn47085"

RPM_NAME = "texlive-context-cyrillicnumbers-2026.226.svn47085-61.2.noarch.rpm"
RPM_HASH = "66abd787c1bca7b0588165304285a94af7d6a779060496f743579c97be2e52afd1470dad9a4ec93577f1d2b4de28e6cf78387d1b0e853c5e5494fd950ece4f8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-cyrillicnumbers"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
