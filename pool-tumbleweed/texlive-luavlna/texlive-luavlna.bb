SUMMARY = "Prevent line breaks after single letter words, units, or academic titles"
DESCRIPTION = "In some languages, like Czech or Polish, there should be no \
single letter words at the end of a line, according to \
typographical norms. This package handles such situations using \
LuaTeX's callback mechanism. In doing this, the package can \
detect languages used in the text and insert spaces only in \
parts of the document where languages requiring this feature \
are used. Another feature of this package is the inclusion of \
non-breakable space after initials (like in personal names), \
after or before academic degrees, and between numbers and \
units. The package supports both plain LuaTeX and LuaLaTeX. \
BTW: 'vlna' is the Czech word for 'wave' or 'curl' and also \
denotes the tilde which, in TeX, is used for 'unbreakable \
spaces'."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1nsvn77682"

RPM_NAME = "texlive-luavlna-2026.226.0.0.1nsvn77682-59.2.noarch.rpm"
RPM_HASH = "66eb14362c75f53a83fead5d80c8be446f4b83437fd85ad29b34f290055387164f8f5b08a258029fd895729e555ff61eb9a62ca5a0a319f77c4ea7307d55010f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luavlna.sty \
tex-luavlna.tex \
texlive-luavlna"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
