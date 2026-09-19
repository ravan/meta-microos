SUMMARY = "A late medieval OpenType cursive font"
DESCRIPTION = "The package contains the free OpenType medieval cursive font \
Aboensis and a style file to use it in XeLaTeX documents. The \
font is based on Codex Aboensis, that is a law book written in \
Sweden in the 1430s. Since medieval cursive is very difficult \
to read for modern people, the font is not suitable for use as \
an ordinary book font, but is intended for emulating late \
medieval manuscripts. The font contains two sets of initials: \
Lombardic and cursive to go with the basic alphabet, and there \
is support for writing two-colored initials and capitals. There \
are also a large number of abbreviation sigla that can be \
accessed as ligature substitutions. The style file contains \
macros that help to use the extended features of the font such \
as initials and two-colored capitals. There are also macros to \
help achieve even pages with consistent line spacing."
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-aboensis-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "ad42d46260fdf3d01989c3da0a54ffb2d7f771d7f1ac32f95da5a077764a33129c5123afcc313d694537bf9062ecad51c13e0a4bf71688433a8a27477da9b454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aboensis.sty \
texlive-aboensis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-xcolor.sty \
texlive \
texlive-aboensis-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
