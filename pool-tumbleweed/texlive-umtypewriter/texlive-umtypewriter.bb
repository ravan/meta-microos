SUMMARY = "Fonts to typeset with the xgreek package"
DESCRIPTION = "The UMTypewriter font family is a monospaced font family that \
was built from glyphs from the CB Greek fonts, the CyrTUG \
Cyrillic alphabet fonts ('LH'), and the standard Computer \
Modern font family. It contains four OpenType fonts which are \
required for use of the xgreek package for XeLaTeX."
LICENSE = "OFL-1.1"

PV = "2026.226.1.1svn64443"

RPM_NAME = "texlive-umtypewriter-2026.226.1.1svn64443-60.2.noarch.rpm"
RPM_HASH = "26ed14b2a765c4fdcee189cdd4fff0eaf3dfb3911a326180bc8572962c957edfb6802355b28ba923437780cdce46dcf98248fead6448e4d1c6b740fef53d8ab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umtypewriter"

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
texlive-scripts-bin \
texlive-umtypewriter-fonts"

inherit rpm
