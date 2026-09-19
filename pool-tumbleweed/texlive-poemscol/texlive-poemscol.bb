SUMMARY = "Typesetting Critical Editions of Poetry"
DESCRIPTION = "The package offers LaTeX macros for typesetting critical \
editions of poetry. Its features include automatic \
linenumbering, generation of separate endnotes sections for \
emendations, textual collations, and explanatory notes, special \
marking for cases in which page breaks occur during stanza \
breaks, running headers of the form 'Notes to pp. xx-yy' for \
the notes sections, index of titles and first lines, and \
automatic generation of a table of contents."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1415926svn56082"

RPM_NAME = "texlive-poemscol-2026.226.3.1415926svn56082-59.2.noarch.rpm"
RPM_HASH = "59579cd4a5d6ea254c8bc57c9855c0d27798e274e47e0a0b00f66e8850daaec699979a2764879f2961591ad14355b4fb4815a98a8223952b058654a88d8dbb37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-poemscol.sty \
texlive-poemscol"

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
