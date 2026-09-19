SUMMARY = "Produce chord information to go with pmx output"
DESCRIPTION = "The bundle supplements pmx, providing the means of typesetting \
chords above the notes of a score. The bundle contains: macros \
for typing the chords; a Lua script to transpose chord macros \
to the required key signature; and support scripts for common \
requirements."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0.2svn73868"

RPM_NAME = "texlive-pmxchords-2026.226.2.0.2svn73868-59.2.noarch.rpm"
RPM_HASH = "d3b432eb80cdd516ea8e974ef5a94ef149067cca61e27bfa1a2c06ebfd852aa0260da0392482dc181a773735d73d964bbccae52583295e700e76428c949a6d07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chords.tex \
tex-chordsCZ.tex \
texlive-pmxchords"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pmxchords-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
