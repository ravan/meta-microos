SUMMARY = "French translations for bibleref"
DESCRIPTION = "The package provides translations and alternative typesetting \
conventions for use of bibleref in French."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4.0svn75246"

RPM_NAME = "texlive-bibleref-french-2026.226.2.4.0svn75246-61.2.noarch.rpm"
RPM_HASH = "a29e87e176326d093f6699ce0d6802081d91275d2859d220c5248b273a9eb587668c15bb3e5543963c6da4fd03e7dbfca52dcff234a16d037fede2dd9768e842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibleref-french.sty \
texlive-bibleref-french"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibleref.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
